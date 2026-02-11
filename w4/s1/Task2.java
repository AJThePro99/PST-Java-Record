import java.util.*;
import java.io.*;

public class Task2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            System.out.println(checkLapindrome(word));
        }
    }

    public static String checkLapindrome(String word) {
        int n = word.length();

        int[] leftFreq = new int[26];
        int[] rightFreq = new int[26];

        for (int i = 0; i < n / 2; i++) {
            leftFreq[word.charAt(i) - 'a']++;
        }

        int startOfRight = (n % 2 == 0) ? (n / 2) : (n / 2 + 1);

        for (int i = startOfRight; i < n; i++) {
            rightFreq[word.charAt(i) - 'a']++;
        }

        return Arrays.equals(leftFreq, rightFreq) ? "YES" : "NO";
    }
}
