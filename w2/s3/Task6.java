// Count the number of digits of a given positive integer number

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        
        while (n > 0 ) {
            n /= 10;
            count++;
        }

        System.out.println("The number of digits is " + count);
    }    
}
