class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer>  map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i]) > k)
            {
                int val = map.get(nums[left]);
                if(val > 1)
                {
                    map.put(nums[left],map.getOrDefault(nums[left],val)-1);
                }
                else{
                    map.remove(nums[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen,i-left+1);
        }

        return maxLen;
    }
}