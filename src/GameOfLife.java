import java.util.Arrays;

public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int n = board.length, m = board[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                int cnt = countBorders(board, i, j);
                board[i][j] += 10 * cnt;
            }
        System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (board[i][j] / 10 == 3 && board[i][j] % 10 == 0) board[i][j] += 100;
                else if ((board[i][j] / 10 == 2 || board[i][j] / 10 == 3) && board[i][j] % 10 == 1) board[i][j] += 100;
            }
        System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                board[i][j] /= 100;
    }

    private int countBorders(int[][] board, int i, int j) {
        int cnt = 0;
        if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] % 10 == 1) cnt++;
        if (i - 1 >= 0 && board[i - 1][j] % 10 == 1) cnt++;
        if (i - 1 >= 0 && j + 1 < board[0].length && board[i - 1][j + 1] % 10 == 1) cnt++;
        if (j - 1 >= 0 && board[i][j - 1] % 10 == 1) cnt++;
        if (j + 1 < board[0].length && board[i][j + 1] % 10 == 1) cnt++;
        if (i + 1 < board.length && j + 1 < board[0].length && board[i + 1][j + 1] % 10 == 1) cnt++;
        if (i + 1 < board.length && board[i + 1][j] % 10 == 1) cnt++;
        if (i + 1 < board.length && j - 1 >= 0 && board[i + 1][j - 1] % 10 == 1) cnt++;
        return cnt;
    }


}
