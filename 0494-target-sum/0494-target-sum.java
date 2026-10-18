class Solution {
    public int targetSum(int i, int target, int[] nums, int[][] dp){
        if(i == 0){
            if(target == 0 && nums[0] == 0) return 2;
            if(target == 0 || nums[i] == target) return 1;
            return 0;
        }
        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int notpick = targetSum(i - 1, target, nums, dp);
        int pick = 0;
        if(nums[i] <= target){
            pick = targetSum(i - 1, target - nums[i], nums, dp);
        }
        dp[i][target] =pick + notpick;
        return dp[i][target];

    }   
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int nu: nums){
            sum += nu;
        }

        int remain = sum - target;
        if(Math.abs(target) > sum) return 0;
        if(remain % 2 != 0) return 0;
        int newtarget = (sum - target) / 2;
        int[][] dp = new int[n][newtarget + 1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return targetSum(n-1, newtarget, nums, dp);
        
    }
}