class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] row: dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return calcPath(0, 0, triangle, dp);
    }
    public int calcPath(int i, int j, List<List<Integer>> triangle, int[][]dp){
        //BASE CASE = you stop when u reach the last row
         if(i == triangle.size()- 1) return triangle.get(i).get(j);
         if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
         int down = triangle.get(i).get(j) + calcPath(i + 1, j, triangle, dp);
         int diagn = triangle.get(i).get(j) + calcPath(i + 1, j + 1, triangle, dp);
         dp[i][j] = Math.min(down, diagn);
         return dp[i][j];
    }
}