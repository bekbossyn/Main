/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      19:07:22
*/


import java.util.Arrays;

public class UniquePathsWithObstacles {

    public int uniquePathsWithObstacles(int[][] mat) {
        if (mat[0][0] == 1) return 0;
        int n = mat.length, m = mat[0].length;
        int[][] b = new int[n][m];
        b[0][0] = 1;
        for (int i = 1; i < n; i++) if (mat[i][0] != 1 && b[i - 1][0] == 1) b[i][0] = 1;
        for (int i = 1; i < m; i++) if (mat[0][i] != 1 && b[0][i - 1] == 1) b[0][i] = 1;


        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(b[i]));

        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                if (mat[i][j] != 1) {
                    b[i][j] = b[i - 1][j] + b[i][j - 1];
                }
        return b[n - 1][m - 1];
    }

}
