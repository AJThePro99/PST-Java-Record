import java.util.HashSet;

class Task4 {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean status = set.add(nums[i]);
            if (status == false) {
                return true;
            }
        }
        return false;
    }
}