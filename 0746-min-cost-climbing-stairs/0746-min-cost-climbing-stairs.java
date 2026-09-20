class Solution {
    static int[] dp;
    public int calcCost(int[] cost, int i){
        if(i >= cost.length){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int oneStep = calcCost(cost, i + 1);
        int twoStep = calcCost(cost, i + 2);
        dp[i] = cost[i] + Math.min(oneStep, twoStep);
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        int cost1 = calcCost(cost, 0);
        int cost2  = calcCost(cost, 1); 
        return Math.min(cost1, cost2);
        
    }
}