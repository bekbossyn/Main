/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      22:04:03
*/


public class UniquePathsIII {
    static int cnt = 0;
    static int[][] d = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    static int ways;
    static int endX;
    static int endY;

    public int uniquePathsIII(int[][] g) {
        int startX = 0;
        int startY = 0;
        int unvisited = 0;
        ways = 0;
        int n = g.length, m = g[0].length;
        boolean[][] v = new boolean[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (g[i][j] == 2) {
                    endX = i;
                    endY = j;
                } else if (g[i][j] == -1) v[i][j] = true;
                else unvisited++;
            }
        solve(g, startX, startY, v, unvisited);
        return ways;
    }

    void solve(int[][] g, int x, int y, boolean[][] v, int unvisited) {
        // out of box
        if (x < 0 || y < 0 || x >= g.length || y >= g[0].length || v[x][y]) return;
        // end point
        if (g[x][y] == 2 && unvisited == -1) {
            ways++;
            return;
        }
        unvisited--;
        v[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + d[i][0];
            int ny = y + d[i][1];
            solve(g, nx, ny, v, unvisited);
        }
        v[x][y] = false;
    }

}
