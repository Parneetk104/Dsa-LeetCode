class Solution {
    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return oper(n - 1, m - 1, word1, word2, dp);
    }

    public int oper(int i, int j, String s1, String s2, int[][] dp){
        if(i < 0) return j + 1; //j + 1, add all the remianing from the word2
        if(j < 0) return i + 1; //word2 is exhaused
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        //if match skip
        if(s1.charAt(i) == s2.charAt(j)){
            int skip = oper(i - 1, j - 1, s1, s2, dp);
            return dp[i][j] = skip;
        }
        int del = 1 + oper(i - 1, j, s1, s2, dp);
        int repl = 1 + oper(i - 1, j - 1, s1, s2, dp);
        int insert = 1 + oper(i, j - 1, s1, s2, dp);
        return dp[i][j] = Math.min(del, Math.min(repl, insert));
    }
}