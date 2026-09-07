class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 2;
        if(nums.length <= 2) return nums.length;
        for(int fast = 2; fast < nums.length; fast++){
            if(nums[fast] != nums[slow - 2]){
                nums[slow] = nums[fast];
                slow++; 
            }  
        }
        return slow;
        
    }
}