public class Task1 {
    public static void main(String[] args) {
        // Code to be implemented
        
    }

    public static boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int countA = 0;
        int countB = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                countA++;
            }
            if (vowels.indexOf(s.charAt(mid + i)) != -1) {
                countB++;
            }
        }

        return countA == countB;
    }
}
