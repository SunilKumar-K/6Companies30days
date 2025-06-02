class Solution {
    public int maxSubArray(int[] nums) {
        int sum  =0;
        int maxSum =nums[0];
        if(nums.length == 1) return nums[0];

        for(int num : nums)
        {
            if(sum < 0) sum = 0;
            sum += num;
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;
    }
}