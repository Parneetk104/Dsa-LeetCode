class Solution {
    //For multiply , use long ------------------->>>>>>>>>>>>>>>>>
    public int mySqrt(int x) {
        if(x < 2) return x;
        long low = 1, high = x;
        long ans = 0;
        
        while(low <= high){
            long mid = low + (high - low)/2;
            long res = mid * mid;
            if(res > x){
                high = mid - 1;

            }else if(res == x){
                return (int) mid;

            }else {
                ans = mid;
                low = mid + 1;
            }
        }
        return (int) ans;
    }
}