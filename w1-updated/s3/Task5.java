package w1-updated.s1;

public class Task5 {
    int count = 0;

        for (int i = input1; i <= input2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
	}

    public boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }            
        }
        return true;
    }
    
}
