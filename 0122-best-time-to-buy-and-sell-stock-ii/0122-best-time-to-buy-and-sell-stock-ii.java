class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[prices.length + 1][2];
        // dp[n][0] = 0;
        // dp[n][1] = 0;

        for(int i = n - 1; i >= 0; i--){
            int buy = -prices[i] + dp[i + 1][0];
            int notbuy = dp[i+1][1];
            dp[i][1] = Math.max(buy, notbuy);

            int sell = prices[i] + dp[i+1][1];
            int hold = dp[i+1][0];
            dp[i][0] = Math.max(sell, hold);
        } 
         return dp[0][1];
        
    }
    
}