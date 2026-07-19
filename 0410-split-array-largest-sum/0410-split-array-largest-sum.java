class Solution {
    //Can I split the array into at most k subarrays if every subarray sum must be ≤ mid?
    public boolean splitPossible(int[] nums, int k, int mid){
        int subArr = 1;
        int sum = 0;
        for(int n: nums){
            if(n + sum > mid){
                subArr++;
                sum = n;
            }else {
                sum += n;
            }
        }
        return subArr <= k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0, high = 0;
        for(int i = 0; i < n; i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        int ans = low;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(splitPossible(nums, k, mid)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}