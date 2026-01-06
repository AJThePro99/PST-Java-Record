import java.util.PriorityQueue;
import java.util.Arrays;

class Task5 {
    // Given an array of integers and a positive integer K, write a program
    // to find:The Kth smallest element

    public static void main(String[] args) {
        int[] array = {2, 6, 1, 31, 45, 12, 65, 83, 92, 47, 83, 10, 62};
        int k = 4;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int number: array) {
            pq.add(number);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        System.out.println("The " + k + "th smallest element in the array is " + pq.peek());
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
    }
}
