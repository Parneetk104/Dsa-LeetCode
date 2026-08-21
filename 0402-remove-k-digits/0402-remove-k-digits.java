class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        st.push(num.charAt(0));
        for(int i = 1; i < num.length(); i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);

        }
        while(k > 0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        String res = sb.toString();
        res = res.replaceFirst("^0+", ""); 
        if (res.isEmpty()) {
            return "0";
        }
        return res;
    }
}