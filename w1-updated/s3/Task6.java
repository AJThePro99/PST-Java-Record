package w1-updated.s1;

public class Task6 {
        int num = input1;
        int powerSum = 1;
        int overlap = 0;

        while (num > 0) {
            int power = num % 10;
            num /= 10;
            overlap = num % 10;

            powerSum += Math.pow(overlap, power);
        }

        return powerSum;
	}
    
}
