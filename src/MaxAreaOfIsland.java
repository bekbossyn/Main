import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {

        final int[][] d = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        int maxArea = 0;
        int n = grid.length, m = grid[0].length;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1) {
                    int count = 0;
                    Queue<Integer> x = new LinkedList<>();
                    Queue<Integer> y = new LinkedList<>();
                    x.add(i);
                    y.add(j);
                    while (!x.isEmpty()) {
                        int nx = x.remove();
                        int ny = y.remove();
                        if (grid[nx][ny] == 0) continue;
                        grid[nx][ny] = 0;
                        count++;
                        for (int ii = 0; ii < 4; ii++) {
                            int qx = nx + d[ii][0];
                            int qy = ny + d[ii][1];
                            if (qx >= 0 && qx < n && qy >= 0 && qy < m && grid[qx][qy] == 1) {
                                x.add(qx);
                                y.add(qy);
                            }
                        }
                    }
                    if (maxArea < count) maxArea = count;
                }

        return maxArea;
    }

}
