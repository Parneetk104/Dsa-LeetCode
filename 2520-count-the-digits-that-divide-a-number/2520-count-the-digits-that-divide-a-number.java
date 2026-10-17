class Solution {
    public int countDigits(int num) {
        int cnt = 0;
        int temp = num;
        while(temp > 0){
            int d = temp % 10;
            if(num % d == 0){
                cnt++;
            } 
            temp = temp / 10;
        }
        return cnt;
    }
}