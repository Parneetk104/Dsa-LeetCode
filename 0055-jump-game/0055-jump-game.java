class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;
        int i = 0;
        while(i < nums.length){
            if(i > maxIdx) return false;
            maxIdx = Math.max(maxIdx, i + nums[i]);
            if(maxIdx == nums.length) return true;
            i++;
        }
        return true;
    }
}