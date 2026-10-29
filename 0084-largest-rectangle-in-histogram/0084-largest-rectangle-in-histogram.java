class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i <= heights.length; i++){
            int currheight = (heights.length == i)? 0: heights[i];
            while(!st.isEmpty() && heights[st.peek()] >= currheight){
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