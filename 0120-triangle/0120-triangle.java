class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] next = new int[n];
        for(int j = 0; j < n; j++){
            next[j] = triangle.get(n-1).get(j);
        }
        //bottom to top
        for(int  i = n - 2; i >= 0; i--){
            int[] curr = new int[i + 1];
            for(int j = i; j >= 0; j--){
                curr[j] = triangle.get(i).get(j) + Math.min(next[j], next[j + 1]); 
            }
            next = curr;
        }
        return next[0];
    }
}