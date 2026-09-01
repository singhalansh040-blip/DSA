class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] ans = new int[nums.length];
        int index = 0;

        // Even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[index] = nums[i];
                index++;
            }
        }

        // Odd numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                ans[index] = nums[i];
                index++;
            }
        }

        return ans;
    }
}