import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solve {

    final int[][] d = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public void solve(char[][] b) {
        int n = b.length;
        int m = b[0].length;
        for (int i = 0; i < n; i++) {
            int j = 0;
            if (b[i][j] == 'O') {
                Queue<Integer> x = new LinkedList<>();
                Queue<Integer> y = new LinkedList<>();
                x.add(i);
                y.add(j);
                while (!x.isEmpty()) {
                    int nx = x.remove();
                    int ny = y.remove();
                    if (b[nx][ny] == 'X' || b[nx][ny] == 'E') continue;
                    b[nx][ny] = 'E';
                    for (int ii = 0; ii < 4; ii++) {
                        int qx = nx + d[ii][0];
                        int qy = ny + d[ii][1];
                        if (qx >= 0 && qx < n && qy >= 0 && qy < m && b[qx][qy] == 'O') {
                            x.add(qx);
                            y.add(qy);
                        }
                    }
                }
            }
            j = m - 1;
            if (b[i][j] == 'O') {
                Queue<Integer> x = new LinkedList<>();
                Queue<Integer> y = new LinkedList<>();
                x.add(i);
                y.add(j);
                while (!x.isEmpty()) {
                    int nx = x.remove();
                    int ny = y.remove();
                    if (b[nx][ny] == 'X' || b[nx][ny] == 'E') continue;
                    b[nx][ny] = 'E';
                    for (int ii = 0; ii < 4; ii++) {
                        int qx = nx + d[ii][0];
                        int qy = ny + d[ii][1];
                        if (qx >= 0 && qx < n && qy >= 0 && qy < m && b[qx][qy] == 'O') {
                            x.add(qx);
                            y.add(qy);
                        }
                    }
                }
            }
        }

        for (int j = 0; j < m; j++) {
            int i = 0;
            if (b[i][j] == 'O') {
                Queue<Integer> x = new LinkedList<>();
                Queue<Integer> y = new LinkedList<>();
                x.add(i);
                y.add(j);
                while (!x.isEmpty()) {
                    int nx = x.remove();
                    int ny = y.remove();
                    if (b[nx][ny] == 'X' || b[nx][ny] == 'E') continue;
                    b[nx][ny] = 'E';
                    for (int ii = 0; ii < 4; ii++) {
                        int qx = nx + d[ii][0];
                        int qy = ny + d[ii][1];
                        if (qx >= 0 && qx < n && qy >= 0 && qy < m && b[qx][qy] == 'O') {
                            x.add(qx);
                            y.add(qy);
                        }
                    }
                }
            }
            i = n - 1;
            if (b[i][j] == 'O') {
                Queue<Integer> x = new LinkedList<>();
                Queue<Integer> y = new LinkedList<>();
                x.add(i);
                y.add(j);
                while (!x.isEmpty()) {
                    int nx = x.remove();
                    int ny = y.remove();
                    if (b[nx][ny] == 'X' || b[nx][ny] == 'E') continue;
                    b[nx][ny] = 'E';
                    for (int ii = 0; ii < 4; ii++) {
                        int qx = nx + d[ii][0];
                        int qy = ny + d[ii][1];
                        if (qx >= 0 && qx < n && qy >= 0 && qy < m && b[qx][qy] == 'O') {
                            x.add(qx);
                            y.add(qy);
                        }
                    }
                }
            }
        }

        for (int i = 1; i < n - 1; i++)
            for (int j = 1; j < m - 1; j++)
                if (b[i][j] == 'O') {
                    Queue<Integer> x = new LinkedList<>();
                    Queue<Integer> y = new LinkedList<>();
                    x.add(i);
                    y.add(j);
                    while (!x.isEmpty()) {
                        int nx = x.remove();
                        int ny = y.remove();
                        if (b[nx][ny] == 'X') continue;
                        b[nx][ny] = 'X';
                        for (int ii = 0; ii < 4; ii++) {
                            int qx = nx + d[ii][0];
                            int qy = ny + d[ii][1];
                            if (qx >= 0 && qx < n && qy >= 0 && qy < m && b[qx][qy] == 'O') {
                                x.add(qx);
                                y.add(qy);
                            }
                        }
                    }
                }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (b[i][j] == 'E') b[i][j] = 'O';

    }

}
