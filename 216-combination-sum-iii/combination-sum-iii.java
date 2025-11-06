class Solution {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> tempList = new ArrayList<>();
        backtrack(k,n,tempList,1,0);
        return result;
    }

    private void backtrack(int k , int n ,List<Integer> tempList, int start, int sum)
    {
        if(k == tempList.size() && sum == n)
        {
            result.add(new ArrayList<>(tempList));
            return ;
        }

        for(int i = start;i<=9;i++)
        {
            tempList.add(i);
            backtrack(k,n,tempList,i+1,sum+i);
            tempList.remove(tempList.size()-1);
        }
    }
}