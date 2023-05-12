/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/12
[HH:MM:SS]      20:03:53
*/


import java.util.ArrayList;
import java.util.List;

public class SolveNQueens {

    private static int ways;
    private static List<List<String>> result;
    private static List<Integer> ax;
    private static List<Integer> ay;
    private static List<Integer> lefts;

    public List<List<String>> solveNQueens(int n) {
        //  create board
        char[][] board = new char[n][n];
        //  fill board with empty places
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        //  initialize variables
        ways = 0;
        result = new ArrayList<>();
        ax = new ArrayList<>();
        ay = new ArrayList<>();
        lefts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            backtrack(board, 0, i, n);
        }

        return result;
    }

    // board = board to put queens
    // x,y = coordinates of new Queen
    //  left = number of queens left to put to board
    void backtrack(char[][] board, int x, int y, int left) {
        //  setting data
        board[x][y] = 'Q';
        ax.add(x);
        ay.add(y);
        left--;
        //  no Queens left to put
        if (left == 0) {
            //  increment count of ways
            ways++;
            //  saving coordinates for new solution
            putQueens(board);
            //  unSetting
            board[x][y] = '.';
            ax.remove(ax.size() - 1);
            ay.remove(ay.size() - 1);
            return;
        }
        int xx = x + 1;
        for (int yy = 0; yy < board[0].length; yy++) {
            boolean allowed = true;
            for (int j = 0; j < ax.size(); j++) {
                int nx = ax.get(j);
                int ny = ay.get(j);
                if (intersects(nx, ny, xx, yy)) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) backtrack(board, xx, yy, left);
        }

        //  unSetting data
        board[x][y] = '.';
        ax.remove(ax.size() - 1);
        ay.remove(ay.size() - 1);
    }

    void putQueens(char[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < board[0].length; j++)
                s.append(board[i][j]);
            list.add(s.toString());
        }
        // adding the answer to set of answers RESULT
        //  #TODO check, if list is copied here
//        result.add(list);
        result.add(new ArrayList<>(list));
    }

    boolean intersects(int x, int y, int xx, int yy) {
        if (Math.abs(x - xx) == Math.abs(y - yy)) return true;
        if (x == xx || y == yy) return true;
        return false;
    }

}
