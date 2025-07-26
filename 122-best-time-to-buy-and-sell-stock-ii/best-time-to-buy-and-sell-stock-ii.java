class Solution {
    public int maxProfit(int[] prices) {
        int start = 0 ;
        int end = 1;
        int profit = 0; 
        while(end < prices.length)
        {
            if(prices[end] > prices[start])
            {
                profit += prices[end++]-prices[start++];
            }
            else{
                end++;
                start++;
            }
        }

        return profit;
    }
}