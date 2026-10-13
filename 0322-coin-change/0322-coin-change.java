class Solution {
    public int coinSum(int i, int target, int[] coins, int[][] dp){
        if(i == 0){
            if(target % coins[0] == 0) return target/coins[0];
            return (int) 1e9;
        }
        if(dp[i][target] != -2){
            return dp[i][target];
        }

        int notTake = coinSum(i - 1, target, coins, dp);
        int take = (int) 1e9;
        if(coins[i] <= target){
            take = 1 + coinSum(i, target - coins[i], coins, dp);
        }
        dp[i][target] = Math.min(notTake, take);
        return dp[i][target];

    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        int target = amount;

        for(int t= 0; t <= target; t++){
            if(t % coins[0] == 0) {
                dp[0][t] = t / coins[0];
            }else {
                dp[0][t] = (int) 1e9;
            }
        }
        for(int i = 1; i < n; i++){
            for(int t = 0; t <= target; t++){
                 int notTake = dp[i-1][t];
                 int take = (int) 1e9;
                if(coins[i] <= t){
                    take = 1 + dp[i][t - coins[i]];
                }
                dp[i][t] = Math.min(notTake, take);
            }
        }
        int ans = dp[n-1][target];
        return (ans == (int) 1e9)? -1: ans;
        
    }
}