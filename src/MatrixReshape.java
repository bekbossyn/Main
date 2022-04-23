public class MatrixReshape {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) return mat;
        int[][] rc = new int[r][c];
        int im = 0, jm = 0, i = 0, j = 0;
        while (im < mat.length) {
            rc[i][j] = mat[im][jm];
            j++;
            if (j >= c) {
                i++;
                j = 0;
            }
            jm++;
            if (jm >= mat[0].length) {
                im++;
                jm = 0;
            }
        }
        return rc;
    }

}
