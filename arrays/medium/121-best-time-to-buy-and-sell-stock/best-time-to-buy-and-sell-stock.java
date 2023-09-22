class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0, min = prices[0], len = prices.length;

        for(int i = 1; i < len; i++){
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(prices[i] - min, maxProfit);
        }
        return maxProfit;
    }
}