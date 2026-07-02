class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int count = 0;
        int prod = 1;
        for(int r = 0; r < nums.length; r++){
            prod *= nums[r];
            while(prod >= k){
                prod /= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}