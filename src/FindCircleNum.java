import java.util.LinkedList;
import java.util.Queue;

public class FindCircleNum {

    public int findCircleNum(int[][] g) {
        int n = g.length;
        int cnt = 0;
        int[] v = new int[n];
        for (int i = 0; i < n; i++)
            if (v[i] == 0) {
                v[i] = ++cnt;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                while (!q.isEmpty()) {
                    int cur = q.remove();
                    for (int j = 0; j < n; j++)
                        if (j != cur && g[cur][j] == 1 && v[j] == 0) {
                            v[j] = cnt;
                            q.add(j);
                        }
                }
            }
        return cnt;
    }

}
