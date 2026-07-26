class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i <= n; i++){
            int num = i, c = 0;
            while(num > 0){
                if((num & 1) != 0){
                    c++;
                }
                num = num >> 1;
            }
            ans[i] = c;
            
        }
        return ans;

        
        
        
    }
}

/**
int[] ans = new int[n + 1];
        for(int i = 0; i <= n; i++){
            int num = i, c = 0;
            while(num > 0){
                c += (num & 1);
                num >>= 1;
            }
            ans[i] = c;
        }
        return ans;
 */