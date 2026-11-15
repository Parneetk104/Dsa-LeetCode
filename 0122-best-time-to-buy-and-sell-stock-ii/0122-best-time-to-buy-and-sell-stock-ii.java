class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp = new Integer[prices.length][2];
        return buySell(0, 1, prices, prices.length, dp);
    }
    public int buySell(int i, int canbuy , int[] prices, int n, Integer[][] dp){
        if(i == n){
            return 0;
        }
        if(dp[i][canbuy] != null){
            return dp[i][canbuy];
        }
        int prof = 0;
        if(canbuy == 1){
            //lose money today
            int buy = -prices[i] + buySell(i + 1, 0, prices, n, dp);
            //dont lose money
            int notbuy = buySell(i + 1, 1, prices, n, dp);
            prof = Math.max(buy, notbuy);
        }else {
            int sell = prices[i] + buySell(i + 1, 1, prices, n, dp);
            int hold = buySell(i + 1, 0, prices, n, dp);
            prof = Math.max(sell, hold);
        }
        return dp[i][canbuy] = prof;

    }
}