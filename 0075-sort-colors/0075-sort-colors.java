class Solution {
    private void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void sortColors(int[] nums) {
        int l = 0;
        int mid = 0, r = nums.length - 1;
        while(mid <= r){
            if(nums[mid] == 0){
                swap(nums, l, mid);
                mid++;
                l++;

            }else if(nums[mid] == 1){
                mid++;

            }else if(nums[mid] == 2){
                swap(nums, mid, r);
                r--;
            }
        }
        
    }
}