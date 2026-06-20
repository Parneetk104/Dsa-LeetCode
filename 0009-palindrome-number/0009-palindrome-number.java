class Solution {
    public boolean isPalindrome(int x) {
        int orig = x;
        int reversed = 0;
        while(x > 0){
            int dig = x % 10;
            reversed = reversed * 10 + dig;
            x = x / 10;
        }
        if(orig == reversed){
            return true;
        } else {
            return false;
        }
    }
}