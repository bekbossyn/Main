public class NumIslands {

    public int numIslands(char[][] g) {
        int n = g.length;
        int m = g[0].length;
        int cnt = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == '1') {
                    search(g, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void search(char[][] g, int i, int j) {
        g[i][j] = '0';
        if (i + 1 < g.length && g[i + 1][j] == '1') search(g, i + 1, j);
        if (j + 1 < g[0].length && g[i][j + 1] == '1') search(g, i, j + 1);
        if (j - 1 >= 0 && g[i][j - 1] == '1') search(g, i, j - 1);
        if (i - 1 >= 0 && g[i - 1][j] == '1') search(g, i - 1, j);
    }

}
