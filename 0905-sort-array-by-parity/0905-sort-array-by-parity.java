class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int  n = nums.length;
        //int[] ans = new int[n];
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast] % 2 == 0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
        return nums;
    }
}