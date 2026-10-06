class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int j = 0; j < m; j++){
            dp[0][j] = matrix[0][j];
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                int down = 1000000000, downL = 1000000000, downR = 1000000000;
                
                down = matrix[i][j] + dp[i - 1][j];
                if(j > 0){
                    downL = matrix[i][j] + dp[i - 1][j - 1];
                }
                if(j < m - 1) {
                    downR = matrix[i][j] + dp[i - 1][j + 1];
                }
                dp[i][j] = Math.min(down, Math.min(downL, downR));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int j = 0; j < m; j++){
            ans = Math.min(ans, (dp[n - 1][j]));
        }
        return ans;
    }
}