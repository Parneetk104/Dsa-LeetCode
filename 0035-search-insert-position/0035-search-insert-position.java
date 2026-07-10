class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n;
        while(low < high){
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                high = mid;
            }else {
                low = mid + 1;
            }

        }
        return high;

    }
}