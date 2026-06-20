/*for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                //if empty stack
                if(stack.size() == 0){
                    return false;
                } else {
                    char top = stack.pop();
                    if(ch == ')' && top != '('){
                        return false;
                        //stack.pop();
                    } 
                    if(ch == ']' && top != '['){
                        return false;
                        //stack.pop();
                    }
                    if(ch == '}' && top != '{'){
                        return false;
                        //stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();*/




class Solution {
    public boolean isValid(String s) {
       Stack <Character> st = new Stack<>();
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(ch == '(' || ch == '[' || ch == '{'){
            st.push(ch);
        } else {
            if(st.size() == 0){
                return false;
            }else {
                char top = st.pop();
                if((ch == ')' && top != '(') ||
                (ch == ']' && top != '[') || (ch == '}' && top != '{')){
                    return false;
                }
            }
        }

       }
       return st.isEmpty();
    }
}