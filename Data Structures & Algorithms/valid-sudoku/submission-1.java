class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board.length;i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            for(int j=0;j<board[0].length;j++){
                
                if(board[i][j] != '.')
                    if(!row.add(board[i][j])) return false;

                if(board[j][i] != '.')
                    if(!col.add(board[j][i])) return false;

                int r = (i/3) *3 + j/3;
                int c = (i%3) *3 + j%3;

                if(board[r][c] != '.')
                    if(!box.add(board[r][c])) return false;
            }
        }

        return true;
    }
}
