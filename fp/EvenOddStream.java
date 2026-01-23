import java.util.stream.IntStream;

public class EvenOddStream {
    public static void main(String[] args) {
        int base = 12345;

        IntStream digitStream1 = IntStream.iterate(base, n -> n > 0, n -> n / 10).map(n -> n % 10);
        IntStream digitStream2 = IntStream.iterate(base, n -> n > 0, n -> n / 10).map(n -> n % 10);

        int evenSum = digitStream1.filter(d -> d % 2 == 0).sum();
        int oddSum = digitStream2.filter(d -> d % 2 != 0).sum();

        System.out.println("Even Sum of " + base + " is " + evenSum);
        System.out.println("Odd Sum of " + base + " is " + oddSum);
    }    
}
