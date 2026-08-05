class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int start = 0, end = 0;
        int maxIdx = 0;
        while(start < nums.length - 1){
            maxIdx = Math.max(maxIdx, start + nums[start]);
            if(start == end){
                jumps++;
                end = maxIdx;
                
            }
            start++;
           
        }
        return jumps;
        
    }
}