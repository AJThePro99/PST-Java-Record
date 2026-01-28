/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        getMinMaxSum(list);
    }

    public static void getMinMaxSum(List<Integer> list) {
        int minSum = list
            .stream()
            .mapToInt(i -> i)
            .sorted()
            .limit(4)
            .sum();

        int maxSum = list
            .stream()
            .mapToInt(i -> i)
            .sorted()
            .skip(1)
            .sum();

        System.out.println("Min Sum: " + minSum + "\n" + "Max Sum: " + maxSum);
    }
}
