class Solution {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[currentIndex] = nums[i];
                currentIndex += 1;
            }
        }

        return currentIndex;
    }
}