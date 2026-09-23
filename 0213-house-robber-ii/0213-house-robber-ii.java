class Solution {
    private int maxMoney(int start, int end, int[] nums){
        int[] dp = new int[nums.length + 2];
        for(int i = end; i >= start; i--){
            int pick =  nums[i] + dp[i + 2];
            int skip = dp[i + 1];
            dp[i] = Math.max(pick, skip);
        }
        return dp[start];
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sol1 = maxMoney(0, nums.length - 2, nums);
        int sol2 = maxMoney(1, nums.length - 1, nums);
        return Math.max(sol1, sol2);

        
    }
}