class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] dp = new int[n1][n2];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return solve(text1.length() - 1, text2.length() - 1, text1, text2, dp);
    }

    public int solve(int i , int j , String text1, String text2, int[][] dp){
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + solve(i - 1, j - 1, text1, text2, dp);
        }
        int left = solve(i - 1, j, text1, text2, dp);
        int right = solve(i, j - 1, text1, text2, dp);
        return dp[i][j] = Math.max(left, right);
    }
}