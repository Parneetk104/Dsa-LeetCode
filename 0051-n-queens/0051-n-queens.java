class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        nQueen(n, board, 0, ans);
        return ans;

    }

    public void nQueen(int n, char board[][], int row, List<List<String>> ans){
        //base case
        if(row == n){
            // copy this 2D char array into list of string 
            List<String> l = new ArrayList<>();
            for(int i = 0; i < n; i++){
                String str = "";
                for(int j = 0; j < n; j++){
                    str += board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }

        for(int j = 0; j < n; j++){
            if(isSafe(n, board, row, j)){
                board[row][j] = 'Q';
                nQueen(n, board, row + 1, ans);
                board[row][j] = '.';       //backtracking
            }
        }
    }

    public boolean isSafe(int n, char[][] board, int row, int col){
       
        //check the row and col particularly if found Q 
        //check row
        for(int j = 0; j < n; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //check Col
        for(int i = 0; i < n; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //check north east
        int i = row, j = col;
        while(i >= 0 && j < n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        //check south East
        i = row;
        j = col;
        while(i < n && j < n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //check south west
        i = row;
        j = col;
        while(i < n && j >= 0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        //check North west
        i = row;
        j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        return true;



    }

    


}













/*
//step-1: Create 2D chessboard of nXn
        char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        solve(0, board, res);
        return res;
        
//step 2: place queen into valid cell
    void solve(int row, char [][] board, List<List<String>>res){
        if(row == board.length){
            res.add(constructBoard(board));
            return;
        }

        for(int col = 0; col < board.length; col++){
            //placequeen in valid cell
            if(isValidCell(board, row, col)){
                board[row][col] = 'Q';

                //place remaining queen's
                solve(row + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    //step-3 : verify the cell
    boolean isValidCell(char[][] board, int row, int col){
        //check horizo
        //no 2nd Q can be placed where already Q1 is there
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == 'Q') return false;
        }

        //check verticall ; col constant, row cchange
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q') return false;
        }

        //check the left upper diagnally : row--, col++ here as we go up
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

        //check the right upper diagnally
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    //step:4 Convert char board into string list
    List<String> constructBoard(char [][] board){
        List<String> res = new ArrayList<>();

        for(char [] row: board){
            res.add(new String(row));
        }
        return res;
    }
     */