class Solution {
    public void wiggleSort(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int sorted[] = Arrays.copyOf(nums,n);

        int left = (n - 1) / 2; 
        int right = n - 1; 

        for(int i=0;i<n;i++)
        {
            if(i%2 == 0)
            {
                nums[i] = sorted[left--];
            }
            else{
                nums[i] = sorted[right--];
            }
        }
    }
}