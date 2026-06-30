class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = k - 1;
        int n = nums.length - 1;
        int sum = 0;
        for(int i = l; i <= r; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        while(r < n){
            sum = sum - nums[l];
            l++;
            r++;
            sum = sum + nums[r];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;
    }
}