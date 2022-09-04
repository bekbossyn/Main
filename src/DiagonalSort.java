public class DiagonalSort {
    public int[][] diagonalSort(int[][] m) {
        for (int ii = 0; ii < Math.max(m[0].length, m.length); ii++) {
            for (int i = 0; i < m.length - 1; i++) {
                int k = 0;
                while (k < m.length - 1) {
                    if (k+1 >= m[0].length) break;
                    if (m[i][k] > m[i + 1][k + 1]) {
                        int t = m[i][k];
                        m[i][k] = m[i + 1][k + 1];
                        m[i + 1][k + 1] = t;
                    }
                    k++;
                }
            }

            for (int i = 0; i < m[0].length - 1; i++) {
                int k = 0;
                while (k < m[0].length - 1) {
                    if (k + 1 >= m.length) break;
                    if (m[k][i] > m[k + 1][i + 1]) {
                        int t = m[k][i];
                        m[k][i] = m[k + 1][i + 1];
                        m[k + 1][i + 1] = t;
                    }
                    k++;
                }
            }
        }

        return m;
    }


}
