class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,tempList,0);
        return result;
    }

    private void backtrack(int[] nums,List<Integer> tempList, int start)
    {
        result.add(new ArrayList<>(tempList));

        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backtrack(nums,tempList,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}