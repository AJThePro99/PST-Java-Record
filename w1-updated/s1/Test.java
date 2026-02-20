import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        int n = 50;
        BigInteger factorial = BigInteger.valueOf(1);
        for (long i = 1; i < n ; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            System.out.println(i + ": " + factorial);
        }
    }    
}
