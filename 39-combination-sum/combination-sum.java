class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> leapList = new ArrayList<>();

        int index = 0;
        int sum = 0;

        dfs(index,sum,result,leapList,candidates,target);
        return result;
    }

    public static void dfs(int index,int sum, List<List<Integer>> result,List<Integer> leapList,int[] candidates,int target)
    {
        if(sum == target)
        {
            result.add(new ArrayList<>(leapList));
            return ;
        }
        
        if(sum  > target) return ;
        
        if(index > candidates.length-1) return ;
        int num = candidates[index];
        leapList.add(num);
        dfs(index,sum+candidates[index],result,leapList,candidates,target);
        leapList.remove(leapList.size()-1);
        dfs(index+1,sum,result,leapList,candidates,target);
    }
}