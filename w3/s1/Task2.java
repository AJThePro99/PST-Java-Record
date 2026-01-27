import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your word: ");
        String s = sc.nextLine();
        
        System.out.print("K value: ");
        int k = sc.nextInt();
        
        var substrings = IntStream.range(0, s.length() - k + 1)
                            .mapToObj(i -> s.substring(i, i + k))
                            .toList();
                            
        String smallest = substrings.stream()
                            .min(Comparator.naturalOrder())
                            .get();
                            
        String largest = substrings.stream()
                            .max(Comparator.naturalOrder())
                            .get();
                            
        System.out.println(smallest + "\n" + largest);        
    }
}
