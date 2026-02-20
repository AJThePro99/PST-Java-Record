public class Task4 {
    public int maxSubarraySumCircular(int[] nums) {
        int currMin = nums[0];
        int currMax = nums[0];
        int minSum = nums[0];
        int maxSum = nums[0];

        int totalSum = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(currMin, minSum);

            totalSum += nums[i];
        }

        if (minSum == totalSum) return maxSum;
        
        return Math.max(maxSum, totalSum - minSum);
    }
    
}
