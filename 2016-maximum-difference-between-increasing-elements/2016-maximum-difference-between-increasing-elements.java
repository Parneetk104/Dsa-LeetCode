class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxDiff = -1;
        int min = nums[0];
        for(int i = 1; i < n; i++){

            int diff = nums[i] - min;
            if(nums[i] > min){
                 maxDiff = Math.max(maxDiff, diff);
            }
           
            min = Math.min(min, nums[i]);
        }
        return maxDiff;
    }
}