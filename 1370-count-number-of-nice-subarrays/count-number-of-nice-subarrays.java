class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    

    private int atMostK(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int oddNumberCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Count odd numbers
            if (nums[right] % 2 != 0) {
                oddNumberCount++;
            }
            
            // Shrink the window if there are more than k odd numbers
            while (oddNumberCount > k) {
                if (nums[left] % 2 != 0) {
                    oddNumberCount--;
                }
                left++;
            }
            
            // Count the number of subarrays with at most `k` odd numbers
            count += right - left + 1;
        }
        
        return count;
    }
}
