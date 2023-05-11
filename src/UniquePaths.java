/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      18:52:29
*/


public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) mat[i][0] = 1;
        for (int i = 0; i < m; i++) mat[0][i] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                mat[i][j] = mat[i - 1][j] + mat[i][j - 1];
            }
        }
        return mat[n - 1][m - 1];
    }

}
