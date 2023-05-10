/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      00:19:27
Finish time:    00:37:00
*/


public class Exist {

    public static boolean found;
    static final int[][] d = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (board[i][j] == word.charAt(0)) {
                    board[i][j] = '.';
                    search(board, word, 1, i, j);
                    board[i][j] = word.charAt(0);
                }
        }

        return found;

    }

    void search(char[][] board, String word, int pos, int x, int y) {
        if (found) return;
        if (pos == word.length()) {
            found = true;
            return;
        }
        for (int[] xy : d) {
            int nx = xy[0] + x;
            int ny = xy[1] + y;
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] != '.' && board[nx][ny] == word.charAt(pos)) {
                char c = board[nx][ny];
                board[nx][ny] = '.';
                search(board, word, pos + 1, nx, ny);
                board[nx][ny] = c;
            }
        }

    }

}
