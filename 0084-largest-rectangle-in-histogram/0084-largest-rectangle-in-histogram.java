class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= n; i++){
            int currHeight = (i == n) ? 0: heights[i];
            while(!st.isEmpty() && heights[st.peek()] >=  currHeight){
                int height = heights[st.pop()];
                int right = i;
                int left = st.isEmpty()? -1: st.peek();
                int width = right - left - 1;

                int area = width * height;
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        return maxArea;
    }
}