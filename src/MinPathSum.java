/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      19:20:37
*/


public class MinPathSum {

    public int minPathSum(int[][] g) {

        int n = g.length, m = g[0].length;

        for (int i = 1; i < n; i++) g[i][0] += g[i - 1][0];
        for (int i = 1; i < m; i++) g[0][i] += g[0][i - 1];

        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                g[i][j] = g[i][j] + Math.min(g[i - 1][j], g[i][j - 1]);

        return g[n - 1][m - 1];
    }

}
