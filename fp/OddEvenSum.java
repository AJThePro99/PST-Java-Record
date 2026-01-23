interface DigitSum {
    int calculate(int number);
}

class OddEvenSum {
    public static void main(String[] args) {
        int base = 29650;
        
        DigitSum evenSum = (n) -> {
            int result = 0;
            int digit = 0;

            while (n > 0) {
                digit = n % 10;
                if (digit % 2 == 0) {
                    result += digit;
                }
                n /= 10;
            }
            return result;
        };

        DigitSum oddSum = (n) -> {
            int result = 0;
            int digit = 0;

            while (n > 0) {
                digit = n % 10;
                if (digit % 2 != 0) {
                    result += digit;
                }
                n /= 10;
            }
            return result;
        };

        int evenSolution = evenSum.calculate(base);
        int oddSolution = oddSum.calculate(base);

        System.out.println("Even Sum of " + base + " is " + evenSolution);
        System.out.println("Odd Sum of " + base + " is " + oddSolution);
    }
}
