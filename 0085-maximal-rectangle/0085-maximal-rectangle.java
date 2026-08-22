class Solution {
    
    public int maximalRectangle(char[][] matrix) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        int[] h = new int[cols];
        int maxArea = 0;
        for(int i = 0; i < rows; i++){
            //building historgram
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == '1'){
                    h[j]++;
                }else {
                    h[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRec(h));
        }
        return maxArea;

    }
    public int largestRec(int[] heights) {
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