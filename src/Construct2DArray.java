public class Construct2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (n * m != original.length) return new int[][]{};
        int[][] nm = new int[m][n];
        int cnt = 0;
        int i = 0, j = 0;
        while (cnt < n * m) {
            nm[i][j] = original[cnt];
            cnt++;
            j++;
            if (j >= n) {
                i++;
                j = 0;
            }
        }
        return nm;
    }

}
