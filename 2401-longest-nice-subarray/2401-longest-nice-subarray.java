class Solution {
    //you maintain : mask where mask contains all the set bits of the current window.
    public int longestNiceSubarray(int[] nums) {
        int l = 0; 
        int maxlen = 0;
        int mask = 0;
        for(int r = 0; r < nums.length; r++){
            
            //conflict then remove the numver 
            while((mask & nums[r]) != 0){
                mask ^= nums[l];
                l++;
            }
            //add the number
            mask |= nums[r];
            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
        
    }
}