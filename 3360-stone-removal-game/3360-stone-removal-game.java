class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        int stones = n;
        int i = 0;
        boolean win = false;
        while(stones >= 10 - i){
            stones -= 10 - i;
            i++;
            win = !win;

        }
        if(!win){
            return false;
        }
        return true;
    }
}