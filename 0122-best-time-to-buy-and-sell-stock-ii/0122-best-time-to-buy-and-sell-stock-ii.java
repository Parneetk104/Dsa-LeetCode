class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
       int[] ahead = new int[2];
      
        // dp[n][0] = 0;
        // dp[n][1] = 0;

        for(int i = n - 1; i >= 0; i--){
             int[] curr = new int[2];
            int buy = -prices[i] + ahead[0];
            int notbuy = ahead[1];
            curr[1] = Math.max(buy, notbuy);

            int sell = prices[i] + ahead[1];
            int hold = ahead[0];
            curr[0] = Math.max(sell, hold);
             // Today's answers become the next
            // iteration's future answers
            ahead = curr;
        } 
         return ahead[1];
        
    }
    
}