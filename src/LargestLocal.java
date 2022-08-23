public class LargestLocal {

    public int[][] largestLocal(int[][] g) {
        int[][] gg = new int[g.length - 2][g[0].length - 2];
        for (int i = 0; i < gg.length; i++) {
            for (int j = 0; j < gg[0].length; j++) {
                int maxi = g[i][j];
                maxi = Math.max(maxi, g[i][j + 1]);
                maxi = Math.max(maxi, g[i + 1][j]);
                maxi = Math.max(maxi, g[i + 1][j + 1]);
                maxi = Math.max(maxi, g[i][j + 2]);
                maxi = Math.max(maxi, g[i + 1][j + 2]);
                maxi = Math.max(maxi, g[i + 2][j + 2]);
                maxi = Math.max(maxi, g[i + 2][j]);
                maxi = Math.max(maxi, g[i + 2][j + 1]);
                maxi = Math.max(maxi, g[i + 2][j + 1]);
                gg[i][j] = maxi;
            }
        }
        return gg;
    }

}
