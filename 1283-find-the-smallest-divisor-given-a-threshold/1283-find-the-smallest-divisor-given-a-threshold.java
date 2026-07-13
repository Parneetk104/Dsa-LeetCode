class Solution {
    private Boolean div(int[] nums, int threshold, int mid){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double)nums[i]/mid); 
        }
        return sum <= threshold;

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 0, high = 0;
        for(int i = 0; i < nums.length; i++){
            high = Math.max(high, nums[i]);
        }
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(div(nums, threshold, mid)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }

        }
        return ans;
    }
}