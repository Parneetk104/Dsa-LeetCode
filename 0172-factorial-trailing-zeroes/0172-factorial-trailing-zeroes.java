class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
            int dig = n / 5;
            count += dig;
            n = dig;
        }
        return count;
    }
}