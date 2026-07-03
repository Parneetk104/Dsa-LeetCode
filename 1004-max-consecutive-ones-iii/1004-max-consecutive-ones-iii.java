class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int zeroes = 0;
        int maxlen = 0;
        for(int r = 0; r < n; r++){
            if(nums[r] == 0){
                zeroes++;
            }
            while(zeroes > k){
                if(nums[l] == 0) zeroes--;
                l++;
            }
            if(zeroes <= k){
                maxlen = Math.max(maxlen, r - l +  1);
            }
        }
        return maxlen;

        
    }
}