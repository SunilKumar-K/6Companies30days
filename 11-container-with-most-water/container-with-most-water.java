class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        int left = 0;
        int right = height.length-1;

        while(left < right)
        {
            maxWater = Math.max(maxWater,Math.min(height[left],height[right])*(right-left));
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        // int maxWater = 0;
        // for(int i=0;i<height.length;i++)
        // {
        //     for(int j=i+1;j<height.length;j++)
        //     {
        //         maxWater = Math.max(maxWater,Math.min(height[i],height[j])*(j-i));
        //     }
        // }

        // return maxWater;

        return maxWater;
    }
}