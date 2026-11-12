class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlen = 1;
        int inc = 1, dec = 1;
        if(nums.length == 1)return 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                inc += 1;
                dec = 1;
            }else if(nums[i] < nums[i - 1]){
                inc = 1;
                dec += 1;
            }else {
                inc = 1;
                dec = 1;
            }
            maxlen = Math.max(inc, Math.max(maxlen, dec));
        }
        return maxlen;
    }
}