class Solution {
    public int maxLength(int[] nums) {

         int maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            int prod = 1;
            int g = 0;
            int lc = 1;
            for(int j = i; j < nums.length; j++){
                prod *= nums[j];
                g = gcd(g, nums[j]);
                lc = lcm(lc, nums[j]);
                if(prod == lc * g){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }
}