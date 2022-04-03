import java.util.ArrayList;
import java.util.List;

public class AllCellsDistOrder {

    public int[][] allCellsDistOrder(int rs, int cs, int rC, int cC) {
        int[][] ans = new int[rs * cs][2];
        int[] dist = new int[rs * cs];
        int cnt = 0;
        for (int i = 0; i < rs; i++)
            for (int j = 0; j < cs; j++) {
                ans[cnt][0] = i;
                ans[cnt][1] = j;
                dist[cnt++] = dist(i, j, rC, cC);
            }
        for (int i = 0; i < cnt; i++)
            for (int j = 1; j < cnt; j++)
                if (dist[j] < dist[j - 1]) {
                    int t = dist[j];
                    dist[j] = dist[j - 1];
                    dist[j - 1] = t;
                    t = ans[j][0];
                    ans[j][0] = ans[j - 1][0];
                    ans[j - 1][0] = t;
                    t = ans[j][1];
                    ans[j][1] = ans[j - 1][1];
                    ans[j - 1][1] = t;
                }
        return ans;
    }

    public int dist(int r1, int c1, int r2, int c2) {
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }

}
