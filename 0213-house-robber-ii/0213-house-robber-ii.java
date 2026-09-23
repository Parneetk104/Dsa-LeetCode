class Solution {
    static 
    public int maxMoney(int i, int end, int[] nums, int[] dp){
        if(i > end){
            return 0;
        }
        if(dp[i] != -1) return dp[i];

        int pick = nums[i] + maxMoney(i + 2, end, nums, dp);
        int skip = maxMoney(i + 1, end, nums, dp);
        dp[i] = Math.max(pick, skip);
        return dp[i];

    }
    public int rob(int[] nums) {
       
        //if 1 house, no circular conflict
        if(nums.length == 1) return nums[0];

        //dont rob the fist house 
        int[] dp1 = new int[nums.length];
          Arrays.fill(dp1, -1);
        int sol1 = maxMoney(1, nums.length - 1, nums, dp1);

        //dont rob the last
        int[] dp2 = new int[nums.length];
         Arrays.fill(dp2, -1);
        int sol2 =  maxMoney(0, nums.length - 2, nums, dp2);
        return Math.max(sol1, sol2);

        
    }
}