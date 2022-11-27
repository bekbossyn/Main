public class OnesMinusZeros {

    public int[][] onesMinusZeros(int[][] g) {
        int n = g.length;
        int m = g[0].length;
        int[] oR = new int[n];
        int[] zR = new int[n];
        int[] oC = new int[m];
        int[] zC = new int[m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (g[i][j] == 1) {
                    oR[i]++;
                    oC[j]++;
                } else {
                    zR[i]++;
                    zC[j]++;
                }

        int[][] d = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                d[i][j] = oR[i] + oC[j] - zR[i] - zC[j];
        return d;
    }

}
