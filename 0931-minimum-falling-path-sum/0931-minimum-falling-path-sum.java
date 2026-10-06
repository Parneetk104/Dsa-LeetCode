class Solution {
    public int Paths(int i, int j, int[][] matrix, int[][] dp){
        
        if(j < 0 || j >= matrix[0].length) return 100000000;
        if(i == 0) return matrix[i][j];
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
       
        int downL = matrix[i][j] + Paths(i - 1, j - 1, matrix, dp);
         int down = matrix[i][j] + Paths(i - 1, j, matrix, dp);
        int downR = matrix[i][j] + Paths(i - 1, j + 1, matrix, dp);

        dp[i][j] = Math.min(down, Math.min(downL, downR));
        return dp[i][j];
    }

    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int[] row: dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int c = 0; c < matrix[0].length; c++){
            ans = Math.min(ans, Paths(matrix.length - 1, c, matrix, dp));
        }
        return ans;
    }
}