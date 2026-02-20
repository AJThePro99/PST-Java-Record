package w1-updated.s5;

public class Task9 {int result = 0;
        int n = input1.length;

        for (int i = 0; i < n; i++) {
            if (!isPrime(i)) {
                result += input1[i];
            }
        }
        return result;		
	}

    public boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
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
