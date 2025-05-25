class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //int[]  answer = new int[nums.length];
        int totalProduct = 1;
        boolean isZero = false;
        int count = 0;
        for(int num : nums)
        {
            if(num == 0 )
            {
                isZero = true;
                count++;
                continue;
            }
            else {
                totalProduct *= num;
            }
        }

        if(count > 1) return new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(isZero && nums[i] != 0){
                nums[i] = 0;
            }
            else if(isZero && nums[i] == 0)
            {
                nums[i] = totalProduct;
            }
            else{
                nums[i] = totalProduct/nums[i];
            }
        }

        return nums;
    }
}