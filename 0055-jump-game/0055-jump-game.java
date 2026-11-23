class Solution {
    public boolean canJump(int[] nums) {
        //Instead of actually performing every possible jump, keep track of the farthest index you can reach so far
        if(nums.length == 1) return true;
        int maxIdx = 0, i = 0;
        while(i < nums.length){
            if(i > maxIdx) return false;
            maxIdx = Math.max(maxIdx, i + nums[i]);
            if(maxIdx == nums.length - 1){
                return true;
            }
            i++;
        }
        return true;
    }
}