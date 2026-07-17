class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for(int i = 0; i < 32; i++){
            int bit = n & 1;       //extract last bit
            ans = ans << 1;
            ans = ans | bit;
            n = n >> 1;
        }

        return ans;

        
    }
}