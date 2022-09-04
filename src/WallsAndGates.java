import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {

    final int INF = 2147483647;

    void bfs(int i, int j, int[][] rs) {
        int r = rs.length;
        int c = rs[0].length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i * c + j);
        while (!q.isEmpty()) {
            int x = q.peek() / c;
            int y = q.remove() % c;
            if (x + 1 < r && (rs[x + 1][y] == INF || rs[x + 1][y] > rs[x][y] + 1)) {
                rs[x + 1][y] = rs[x][y] + 1;
                q.add((x + 1) * c + y);
            }
            if (x - 1 >= 0 && (rs[x - 1][y] == INF || rs[x - 1][y] > rs[x][y] + 1)) {
                rs[x - 1][y] = rs[x][y] + 1;
                q.add((x - 1) * c + y);
            }
            if (y - 1 >= 0 && (rs[x][y - 1] == INF || rs[x][y - 1] > rs[x][y] + 1)) {
                rs[x][y - 1] = rs[x][y] + 1;
                q.add(x * c + y - 1);
            }
            if (y + 1 < c && (rs[x][y + 1] == INF || rs[x][y + 1] > rs[x][y] + 1)) {
                rs[x][y + 1] = rs[x][y] + 1;
                q.add(x * c + y + 1);
            }
        }
    }

    public void wallsAndGates(int[][] rs) {
        int r = rs.length;
        int c = rs[0].length;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (rs[i][j] == 0) {
                    bfs(i, j, rs);
                }
    }

}
