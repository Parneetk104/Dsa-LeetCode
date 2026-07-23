class Solution {
    public Boolean Palindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans ="";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(Palindrome(s, i, j)){
                    int len = j - i + 1;
                    if(len > ans.length()){
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }
}