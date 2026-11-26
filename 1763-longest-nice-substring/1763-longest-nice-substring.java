class Solution {
    public String longestNiceSubstring(String s) {
        int maxlen = 0;
        int startIdx = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            boolean[] upper = new boolean[26];
            boolean[] lower = new boolean[26];
            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                if(Character.isLowerCase(ch)){
                    lower[ch - 'a'] = true;
                }else {
                    upper[ch - 'A'] = true;
                }

                if(isNice(lower, upper) && j - i + 1 > maxlen){
                    maxlen = j - i + 1;
                    startIdx = i;
                }
            }
        }
        return s.substring(startIdx, startIdx + maxlen);
    }

    public boolean isNice(boolean[] upper, boolean[] lower){
        for(int k = 0; k < 26; k++){
            if(lower[k] != upper[k]){
                return false;
            }
        }
        return true;
    }
}