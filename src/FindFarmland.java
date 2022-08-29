import java.util.ArrayList;
import java.util.List;

public class FindFarmland {

//    final int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int[][] findFarmland(int[][] l) {
        List<int[]> mL = new ArrayList<int[]>();
        int n = l.length, m = l[0].length;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (l[i][j] == 1) {
                    int[] ll = new int[4];
                    ll[0] = i;
                    ll[1] = j;
                    int[] lll = dfs(i, j, n, m, l);
                    ll[2] = lll[0];
                    ll[3] = lll[1];
                    for (int ii = ll[0]; ii <= ll[2]; ii++)
                        for (int jj = ll[1]; jj <= ll[3]; jj++) l[ii][jj] = 0;
                    mL.add(ll);
                }
            }
        int[][] res = new int[mL.size()][];
        res = mL.toArray(res);
        return res;
    }

    int[] dfs(int x, int y, int n, int m, int[][] l) {
        // find final corner
        if (x + 1 < n && l[x + 1][y] == 1) return dfs(x + 1, y, n, m, l);
        if (y + 1 < m && l[x][y + 1] == 1) return dfs(x, y + 1, n, m, l);
        return new int[]{x, y};
    }

}
