import java.util.LinkedList;
import java.util.Queue;

public class CountComponents {

    public int countComponents(int n, int[][] es) {
        int cnt = 0;
        int[][] a = new int[n][n];
        int[] v = new int[n];
        for (int[] i : es) {
            a[i[0]][i[1]] = 1;
            a[i[1]][i[0]] = 1;
        }
        for (int i = 0; i < n; i++)
            if (v[i] == 0) {
                v[i] = ++cnt;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                while (!q.isEmpty()) {
                    int cur = q.remove();
                    for (int j = 0; j < n; j++) {
                        if (a[cur][j] == 1 && v[j] == 0) {
                            v[j] = cnt;
                            q.add(j);
                        }
                    }
                }
            }
        return cnt;
    }

}
