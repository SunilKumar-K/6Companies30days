class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(min > prices[i])
            {
                min = prices[i];
            }
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
        // int min = prices[0];

        // int profit = 0;
        // for(int i=1;i<prices.length;i++)
        // {
        //     min = Math.min(min,prices[i]);
        //     profit = Math.max(profit,prices[i]-min);
        // }

        // return profit;
    }
}