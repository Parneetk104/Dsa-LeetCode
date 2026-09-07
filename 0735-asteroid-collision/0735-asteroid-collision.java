class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            boolean isAlive = true;
            while(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0 && Math.abs(asteroids[i]) > st.peek()){
                st.pop();
                
            }
            if(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0 && Math.abs(asteroids[i]) == st.peek()){
                st.pop();
                isAlive = false;
            } else if (!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0 && Math.abs(asteroids[i]) < st.peek()) {
                isAlive = false;
            }
            if(isAlive){
                st.push(asteroids[i]);
            }
             
        }
        int[] ans = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
        
    }
}