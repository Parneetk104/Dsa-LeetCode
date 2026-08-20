class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        if(word.indexOf(ch) == -1){
            return word;
        }
        int j = 0;
        for(int i = 0; i < word.length(); i++){
            char cr = word.charAt(i);
            if(cr != ch){
                sb.append(cr);
            }else if(cr == ch){
                sb.append(cr);
                sb.reverse();
                j = i;
                break;
            }
        }
        for(int s = j + 1; s < word.length(); s++){
            sb.append(word.charAt(s));
        }

        return sb.toString();
    }
}