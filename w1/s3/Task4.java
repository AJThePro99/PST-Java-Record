class Task4 {
    // Find the maximum element in an array of n integers
    public static void main(String[] args) {
        int[] array = {2, 6, 1, 31, 45, 12, 65, 83, 92, 47, 83, 10, 62};
        int max = 0;
        
        for (int number: array) {
            max = Math.max(max, number);
        }      
        System.out.println("The max value in the array is " + max);
    }
}
