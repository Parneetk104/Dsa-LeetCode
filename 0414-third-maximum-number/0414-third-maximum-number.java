class Solution {
    public int thirdMax(int[] nums) {
        //Long rang is large for int to not overflow we used long 
        long max1 = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max1 = Math.max(max1, nums[i]);
        }
        long max2 = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max1) continue;
            max2 = Math.max(max2, nums[i]);
        }
        long max3 = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
             if(nums[i] >= max2) continue;
            max3 = Math.max(max3, nums[i]);
            
        }
        if(max3 == Long.MIN_VALUE) return (int) max1;
        return (int) max3;

    }
}