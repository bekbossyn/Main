import java.util.LinkedList;
import java.util.Queue;

public class IslandPerimeter {

    final int[][] d = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int islandPerimeter(int[][] g) {
        int cnt = 0;
        int n = g.length;
        int m = g[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1) {
                    Queue<Integer> qx = new LinkedList<>();
                    Queue<Integer> qy = new LinkedList<>();
                    qx.add(i);
                    qy.add(j);
                    while (!qx.isEmpty()) {
                        int x = qx.remove();
                        int y = qy.remove();
                        System.out.println("x: " + x + " y:" + y);
                        if (g[x][y]==2) continue;
                        g[x][y] = 2;
                        for (int k = 0; k < 4; k++) {
                            int nx = x + d[k][0];
                            int ny = y + d[k][1];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                                cnt++;
                            } else if (g[nx][ny] == 1) {
//                                qx.add(nx * len + ny);
                                qx.add(nx);
                                qy.add(ny);
                            } else if (g[nx][ny] != 2 && g[nx][ny]!=1) cnt++;
                        }
                    }
                    return cnt;
                }
            }
        return 0;
    }
}
