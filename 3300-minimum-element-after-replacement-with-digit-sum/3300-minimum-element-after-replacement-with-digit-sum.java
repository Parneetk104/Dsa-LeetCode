class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int sum = 0;
            while(num > 0){
                int d = num %  10;
                sum += d;
                num = num / 10;
            }
            nums[i] = sum;
        }
        int minY = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            minY = Math.min(minY, nums[i]);
        }
        return minY;
    }
}