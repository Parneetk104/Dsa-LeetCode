class Solution {
    public int smallestNumber(int n, int t) {
        int num = 0;
        for(int i = n; i < n * 10; i++){
            int prod = 1;
            int temp = i;
            while(temp > 0){
                int d = temp % 10;
                prod *= d;
                temp = temp / 10;
            }
            if(prod % t == 0){
                return i;
            }
        }
        return t;
    }
}