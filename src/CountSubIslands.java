import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CountSubIslands {

    public int countSubIslands(int[][] g1, int[][] g2) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        int n = g2.length;
        int m = g2[0].length;
        int cnt = 1;// count starting from 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g2[i][j] == 1) {
                    g2[i][j] = ++cnt;
                    h.put(cnt, true);
                    Queue<Integer> q = new LinkedList<>();
                    q.add(i * m + j);
                    if (g1[i][j] != 1) h.put(cnt, false);
                    int[][] a = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
                    while (!q.isEmpty()) {
                        int x = q.peek() / m;
                        int y = q.remove() % m;
                        for (int[] d : a) {
                            int nx = x + d[0];
                            int ny = y + d[1];
                            if (!(nx < 0 || ny < 0 || nx >= n || ny >= m) && g2[nx][ny] == 1) {
                                g2[nx][ny] = cnt;
                                if (g1[nx][ny] != 1) h.put(cnt, false);
                                q.add(nx * m + ny);
                            }
                        }
                    }
                }
            }
        }
        int c = 0;
        for (int i = 2; i <= cnt; i++) {
            if (h.containsKey(i) && h.get(i)) c++;
        }
        return c;
    }

}
