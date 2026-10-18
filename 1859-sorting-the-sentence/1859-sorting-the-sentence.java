class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, (a, b) -> Character.compare(a.charAt(a.length() - 1), b.charAt(b.length() - 1)));
        String sent = String.join(" ", words);
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < sent.length(); i++){
            char ch = sent.charAt(i);
            if(Character.isLetter(ch)){
                 res.append(ch);
            } else if(Character.isWhitespace(ch)){
                res.append(ch);
            }

        }
        return res.toString();
    }
}