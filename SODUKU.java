class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c!='.'){ // c is number
                    if(!seen.add(c+" found in row "+ i) ||  // Determine whether a number is repeated in a row, column, or block 
                       !seen.add(c+ " found in column "+ j) ||
                       !seen.add(c + " found in block "+ i/3 + "-" + j/3))return false;
                }
            }
        }
        return true;
    }
}