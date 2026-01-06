class Task3 {

    // Search for a given element in a sorted array using Binary Search
    public static void main(String[] args) {
        int target = 15;
        int[] array = { 2, 5, 11, 15, 21, 25, 29, 32, 35, 41, 56 };

        System.out.println(
            "The index of " +
                target +
                " in array is [" +
                binarySearch(array, target) +
                "]"
        );
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
