package w1-updated.s1;

public class Task3 {

    int fun() {
        int x = 0;
        int num = input1;

        while (num > 0) {
            int rem = num % 10;
            x = (x * 10) + rem;
            num /= 10;
        }

        return input1 == x ? 2 : 1;
    }
    
}
