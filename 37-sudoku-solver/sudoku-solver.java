class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {

        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (!emptyLeft) {
                break;
            }
        }

        if (emptyLeft) {
            return true;
        }

        for (char number = '1'; number <= '9'; number++) {

            if (isSafe(board, row, col, number)) {

                board[row][col] = number;

                if (solve(board)) {
                    return true;
                }

                board[row][col] = '.';
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {

        // check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // check 3x3 box
        int rowStart = row - row % 3;
        int colStart = col - col % 3;

        for (int r = rowStart; r < rowStart + 3; r++) {
            for (int c = colStart; c < colStart + 3; c++) {

                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}