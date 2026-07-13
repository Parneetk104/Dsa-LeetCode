class Solution {
    public int findPeakElement(int[] nums) {
      int peak = -1;
        int n = nums.length;
        //check first element, middle eleemnts, last elements seperately
        if(n == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        //check the middle eleemnts
        for(int i = 1; i < n - 1; i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                peak = i;
            }
        }
        if(nums[n - 1] > nums[n - 2]){
            return n - 1;
        }
        return peak;
        
    }
}