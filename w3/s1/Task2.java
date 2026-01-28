import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your word: ");
        String s = sc.nextLine();

        System.out.print("K value: ");
        int k = sc.nextInt();
        sc.close();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        System.out.println(smallest + "\n" + largest);
    }
}
