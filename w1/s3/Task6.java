class Task6 {
    //  Print all possible pairs of elements from an array of size n.
    public static void main(String[] args) {
        int[] array = {2, 6, 1, 31, 45};
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Pair["+i+"]["+j+"] = ("+array[i]+","+array[j]+")");
            }
        }        
    }
}