class Solution {
    public int maxProfit(int[] prices) {
        int min_so_far = prices[0];
        int max_profit = 0;
        int l = prices.length;

        for(int i = 0; i < l; i++)
        {
            min_so_far = Math.min(min_so_far, prices[i]);
            int profit = prices[i] - min_so_far;
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;
        
    }
}