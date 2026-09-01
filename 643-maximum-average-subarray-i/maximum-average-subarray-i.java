class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int maxSum = 0;

        // First k elements ka sum
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int sum = maxSum;

        // Baaki windows check karo
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }
}