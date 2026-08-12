class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxPer = 0;
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] + nums[i + 1] > nums[i + 2]){
                int perimeter = nums[i] + nums[i + 1] + nums[i + 2];
                maxPer = Math.max(maxPer, perimeter);
            }

        }
        return maxPer;
       
    }
}