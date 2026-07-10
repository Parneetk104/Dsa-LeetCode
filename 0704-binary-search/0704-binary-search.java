class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
    // public int find(int[] nums, int target, int low, int high){
    //     if(low > high){
    //         return -1;
    //     }
    //     int mid = low + (high - low)/2;
    //     if(nums[mid] == target) return mid;
    //     else if(nums[mid] > target){
    //         return find(nums, target, low, mid - 1);
    //     }else {
    //         return find(nums, target, mid + 1, high);
    //     }

    // }
}