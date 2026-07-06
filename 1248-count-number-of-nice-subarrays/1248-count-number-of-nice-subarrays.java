class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int count = 0;
        int l = 0;
        int oddcount = 0;
        for(int r = 0; r < n; r++){
            if(nums[r] % 2 == 1){
                oddcount++;
                count = 0;
            }
            while(oddcount == k){
                count++;
                if(nums[l] % 2 == 1){
                    oddcount--;
                }
                l++;
            }
            ans += count;
            
           
        }
        return ans;

    }
}