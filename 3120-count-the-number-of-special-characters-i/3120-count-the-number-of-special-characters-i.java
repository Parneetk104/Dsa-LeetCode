class Solution {
    public int numberOfSpecialChars(String word) {
        int[] low = new int[26];
        int[] cap = new int[26];
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                low[ch - 'a']++;
            }else {
                cap[ch - 'A']++;
            }
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(low[i] > 0 && cap[i] > 0){
                count++;
            }
        }
        return count;

    }
}