import java.util.*;

public class nqueen {

    static void solveNQueens(char[][] board, int row) {

        int n = board.length;

        // Base Case: All queens placed
        if (row == n) {
            printBoard(board);
            System.out.println();
            return;
        }

        // Try placing queen in every column of current row
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                // Place Queen
                board[row][col] = 'Q';

                // Recur for next row
                solveNQueens(board, row + 1);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;

        // Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void printBoard(char[][] board) {

        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solveNQueens(board, 0);
    }
}