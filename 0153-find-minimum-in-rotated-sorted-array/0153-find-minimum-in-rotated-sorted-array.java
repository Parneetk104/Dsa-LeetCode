//Which half is sorted?
    //Can the minimum lie in that sorted half?
    //if not Discard that half.
      //CAN BE DOEN WITH SORTING
    //CAN BE DONE WITH HEAP MIN

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= nums[high]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return nums[high];
    }
}