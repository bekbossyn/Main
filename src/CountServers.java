import java.util.HashSet;

public class CountServers {

    public int countServers(int[][] g) {
        int n = g.length, m = g[0].length;
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (g[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
        int cnt = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (rows[i]>1 || cols[j]>1)
                    cnt+=g[i][j];

        return cnt;
    }
}
