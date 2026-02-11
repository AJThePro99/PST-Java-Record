// check if given string is palindrome

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = sc.nextLine();

        String text = word.toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                System.out.println("Word is not palindrome");
                sc.close();
                return;
            }
            left++;
            right--;
        }
        System.out.println("Word is palindrome");
        sc.close();
        return;
    }
}
