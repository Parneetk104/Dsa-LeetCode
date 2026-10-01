class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = 0; i < n; i++){
            int sum = 0;
            int num = nums[i];
            while(num > 0){
                int d = num % 10;
                sum += d;
                num = num / 10;
            }
            if(sum == i) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}