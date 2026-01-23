package w2.s1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Given a list of integers, find the second highest number in
// the list using stream API. If there is no second highest number
// (all elements same or only one element), print -1.

public class Task1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input size: ");
      int n = sc.nextInt();

      List<Integer> numbers = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        numbers.add(sc.nextInt());
      }

      int secondHighest = numbers.stream()
                            .distinct()
                            .sorted(Comparator.reverseOrder())
                            .skip(1)
                            .findFirst()
                            .orElse(-1);

      System.out.println("Second highest number is " + secondHighest);
    }    
}
