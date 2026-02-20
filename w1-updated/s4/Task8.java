package w1-updated.s4;

public class Task8 {
    int[] digitCounts = new int[10];
        
        for (int num : input1) {
            if (num == 0) digitCounts[0]++;
            num = Math.abs(num);
            
            while (num > 0) {
                int digit = num % 10;
                digitCounts[digit]++;
                num /= 10;
            }
        }

        int maxFrequency = -1;
        int resultDigit = -1;

        for (int i = 0; i <= 9; i++) {
            if (digitCounts[i] >= maxFrequency) {
                maxFrequency = digitCounts[i];
                resultDigit = i;
            }
        }
        return resultDigit;
    
}
