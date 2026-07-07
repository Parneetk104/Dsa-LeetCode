class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] ans = new int[nums.length];
        int k = nums.length - 1;
        while(l <= r){
            if(nums[r] * nums[r] > nums[l] * nums[l]){
                ans[k] = nums[r] * nums[r];
                r--;
                k--;
            }else {
                ans[k] = nums[l] * nums[l];
                l++;
                k--;
            }

           
        }
        return ans;
    }
}