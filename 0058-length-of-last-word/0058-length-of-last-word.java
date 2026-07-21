class Solution {
    public int lengthOfLastWord(String s) {
        String res = s.trim().replaceAll("\\s+", " ");
        String[] word = res.split(" ");
        int len = 0;
        for(int i = 0; i < word.length; i++){
            if(i == word.length - 1){
                len = word[i].length();
            }
        }
        return len;
    }
}