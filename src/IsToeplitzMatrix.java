public class IsToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] mat) {
        boolean is = true;
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++)
            if (helper(mat, i, 0, mat[i][0])) return false;
        for (int j = 0; j < m; j++)
            if (helper(mat, 0, j, mat[0][j])) return false;
        return true;
    }

    boolean helper(int[][] mat, int n, int m, int cur) {
        int nn = mat.length, mm = mat[0].length;
        int cnt = 0;
        while (true) {
            cnt++;
            if (cnt + n >= nn || cnt + m >= mm) return false;
            if (mat[n + cnt][m + cnt] != cur) return true;
        }
    }

}
