class Solution {

    public int scoreOfParentheses(String s) {
        double score = 0;
        int depth = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                depth = depth + 1;
            }else if(ch == ')'){
                if(s.charAt(i - 1) == '('){
                     score += Math.pow(2, depth - 1);
                }
               
                depth--;
            }
        }
        return (int)score;
    }
}