class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length, result = 0;
        for (int i = 0, left = Integer.MIN_VALUE; i < n; i++) {
            for (int j = n - 1, right = Integer.MAX_VALUE; i <= j; j--) {
                result++;
                if (left >= nums[j] || nums[j] >= right) 
                    break;
                right = nums[j];
            }
            if (left >= nums[i]) 
                break;
            left = nums[i];
        }
        return result;
    }
}