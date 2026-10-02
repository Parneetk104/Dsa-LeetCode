class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        
        int countA  = 0, counta = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                countA++;
            }else {
                counta++;
            }
        }
        if(countA == word.length() || counta == word.length()){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && counta == word.length() - 1) return true;
        return false;
    }
}