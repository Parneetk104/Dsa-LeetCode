class Solution {
    public boolean canJump(int[] nums) {
        int i = 0, maxIdx = 0;
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