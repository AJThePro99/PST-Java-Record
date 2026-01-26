import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(value, k));
    } 
    
    public static String getSmallestAndLargest(String s, int k) {
        // Returns a list of all possible substrings
        var substrings = IntStream.range(0, s.length() - k + 1)
                            .mapToObj(i -> s.substring(i, i + k))
                            .toList();

        String smallest = substrings.stream()
                                .min(Comparator.naturalOrder())
                                .get();

        String largest = substrings.stream()
                                .max(Comparator.naturalOrder())
                                .get();

        return smallest + "\n" + largest;
    }
}
