package w1-updated.s1;

public class Task2 {

    public long findN() {
        if (input1 == 1) {
            return 0;
        }
		int count = 1;

        long a = 0;
        long b = 1;

        while (count < input1) {
            long temp = a;
            a = a + b;
            b = temp;

            count++;
        }
        return a;
    }

    
}


