import java.util.HashSet;

public class DifferenceOfDistinctValues {

    public int[][] differenceOfDistinctValues(int[][] g) {
        int n = g.length, m = g[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                int an = count(g, i, j);
                ans[i][j] = an;
            }
        return ans;
    }

    private int count(int[][] g, int i, int j) {
        HashSet<Integer> up = new HashSet<>();
        HashSet<Integer> down = new HashSet<>();
        up.clear();
        down.clear();
        int n = g.length, m = g[0].length;
        int i1 = i - 1, j1 = j - 1;
        while (i1 >= 0 && j1 >= 0) {
            up.add(g[i1][j1]);
            i1--;
            j1--;
        }
        i1 = i + 1;
        j1 = j + 1;
        while (i1 < n && j1 < m) {
            down.add(g[i1][j1]);
            i1++;
            j1++;
        }
        return Math.abs(up.size() - down.size());
    }

}
