class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token: tokens){
            if(!"+-*/^".contains(token)){
                st.push(Integer.parseInt(token));
            }else {
                int b = st.pop();
                int a  =st.pop();

                switch(token){
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                    case "^": st.push((int)Math.pow(a, b)); break;
                }
            }
        }
        return st.pop();
        
    }
}