class Solution {
   
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char ch: s.toCharArray()){
            freq[ch]++;
        }
        int maxlen = 0;
        boolean odd = false;
        for(int f: freq){
            if(f % 2 == 0){
                maxlen += f;
            }else {
                int cont = (f / 2) * 2;
                maxlen += cont;
                 odd= true;
            }
            
          
        
        }
          if(odd) maxlen++;
        return maxlen;
        
    }
}