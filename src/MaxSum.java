public class MaxSum {

    public int maxSum(int[][] g) {
        int n = g.length, m = g[0].length;
        int maxSum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                int sum = g[i][j] + g[i][j + 1] + g[i][j + 2] + g[i + 1][j + 1] +
                        g[i + 2][j] + g[i + 2][j + 1] + g[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

}
