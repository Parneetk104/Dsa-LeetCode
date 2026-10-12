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
        for(int[] row: dp){
            Arrays.fill(row, -2);
        }
        int ans = coinSum(n - 1, amount, coins, dp);
        return ans >= (1e9)? -1: ans;
    }
}