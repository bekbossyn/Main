/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/12
[HH:MM:SS]      01:08:45
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class TotalNQueens {
    private static int ways = 0;
    private static List<Integer> ax;
    private static List<Integer> ay;
    private static List<List<Integer>> rx;
    private static List<List<Integer>> ry;

    public int totalNQueens(int n) {
        // initialize
        ways = 0;
        ax = new ArrayList<>();
        ay = new ArrayList<>();
        rx = new ArrayList<>();
        ry = new ArrayList<>();

        char[][] b = new char[n][n];
        // fill board with spaces
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) b[i][j] = '.';
        for (int i = 0; i < n; i++) {
            backtrack(b, 0, i, n);
        }
        return ways;
    }

    void backtrack(char[][] b, int x, int y, int count) {
        count--;
        ax.add(x);
        ay.add(y);
        b[x][y] = 'Q';
        if (count == 0) {
            // save positions
            rx.add(new ArrayList<>(ax));
            ry.add(new ArrayList<>(ay));
            // removing queen from position and deleting data
            ax.remove(ax.size() - 1);
            ay.remove(ay.size() - 1);
            b[x][y] = '.';
            // increment count of ways
            ways++;
            return;
        }
        // putting queen to position and saving data
//        ax.add(x);
//        ay.add(y);
//        b[x][y] = 'Q';

        // next row
        int xx = x + 1;
        // search for suitable column
        for (int yy = 0; yy < b.length; yy++) {
            // yy is new column
            boolean allowed = true;
            for (int k = 0; k < ax.size(); k++) {
                // get the Queen's coordinates
                int nx = ax.get(k);
                int ny = ay.get(k);
                if (!check(nx, ny, xx, yy)) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) {
                backtrack(b, xx, yy, count);
            }
        }
        // removing queen from position and deleting data
        ax.remove(ax.size() - 1);
        ay.remove(ay.size() - 1);
        b[x][y] = '.';

    }

    boolean check(int x, int y, int xx, int yy) {
        // diagonal
        if (Math.abs(x - xx) == Math.abs(y - yy)) return false;
        // row && column
        if (x == xx || y == yy) return false;
        return true;
    }


}
