class Solution {
    public int maximumLengthSubstring(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
      
        int maxlen = 0;
        int startIdx = 0;
        for(int i = 0; i < s.length(); i++){
            
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                if(occuranc(freq, s) && j - i + 1 > maxlen){
                    maxlen = j - i + 1;
                }
            }
        }
        return maxlen;
    }

    public boolean occuranc(int[] freq, String s){
        for(int k = 0; k < 26; k++){
            if(freq[k] > 2){
                return false;
            }
        }
        return true;
    }
}