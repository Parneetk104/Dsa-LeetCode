class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //trns = 0,1,2
        int[][][] dp = new int[prices.length + 1][2][3];
        // dp[n][0] = 0;
        // dp[n][1] = 0;

        for(int i = n - 1; i >= 0; i--){
            for(int trans = 1; trans <= 2; trans++){
                //transaction doesnt drop until sold the stock 
                int buy = - prices[i] + dp[i + 1][0][trans];
                int notbuy = dp[i+1][1][trans];
                dp[i][1][trans] = Math.max(buy, notbuy);

                int sell = prices[i] + dp[i+1][1][trans-1];
                int hold = dp[i+1][0][trans];
                dp[i][0][trans] = Math.max(sell, hold);
            }
        } 
         return dp[0][1][2];
    }
}