class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];    // 0 to n - 1
        Arrays.fill(dp, -1); // mark krna 
        return loot(0, nums);
    }

    public int loot(int i, int[] nums){
        //BASE CASE
        if(i >= nums.length) return 0;     
        //if had already stored ans
        if(dp[i] != -1)  return dp[i];
        int pick = nums[i] + loot(i + 2, nums);    //believe in recursion that we will get max, write chocies
        int skip = loot(i + 1, nums);
        int ans = Math.max(pick, skip);
        dp[i] = ans;
        return ans;
    }
}