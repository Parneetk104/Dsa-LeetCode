class Solution {
    public int dominantIndex(int[] nums) {
        int maxy = -1;
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxy){
                maxy = nums[i];
                idx = i;
            }
        }
        Arrays.sort(nums);
        if(maxy >= nums[nums.length - 2] * 2){
            return idx;
        }
        return -1;
    }
}