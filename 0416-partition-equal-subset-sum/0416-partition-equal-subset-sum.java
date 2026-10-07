class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 == 1) return false;
        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];
        for(int i = 0; i < nums.length; i++){
            dp[i][0] = true;
        }
        if(target >= nums[0]){
            dp[0][nums[0]] = true;
        }
        for(int i = 1; i < nums.length; i++){
            for(int t = 1; t <= target; t++){
                boolean np = dp[i - 1][t];
                boolean p = false;
                if(t > nums[i]){
                    p = dp[i-1][t - nums[i]];
                }
                dp[i][t] = np || p;
            }
        }
        return dp[nums.length - 1][target];

    }
}