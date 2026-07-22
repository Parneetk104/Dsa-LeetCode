class Solution {
    //Can I solve this by adjusting pointers and checking only the affected part?
    public boolean Palindrome(String str, int l, int r){
        //int l = 0, r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        if(Palindrome(s, i, j)){
            return true;
        }
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return Palindrome(s, i + 1, j) || Palindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return false;
       
        
    }
}