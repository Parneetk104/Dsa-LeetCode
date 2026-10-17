class Solution {
    public double signFunc(double x){
        if(x > 0) return 1;
        if(x < 0) return -1;
        return 0;
    }
    public int arraySign(int[] nums) {
        double prod = 1;
        for(int i = 0; i < nums.length; i++){
            prod *= nums[i];
        }
        return (int) signFunc(prod);
    }
}