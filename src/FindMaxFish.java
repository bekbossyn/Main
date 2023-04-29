public class FindMaxFish {

    public int findMaxFish(int[][] g) {
        int n = g.length;
        int m = g[0].length;
        boolean[][] used = new boolean[n][m];
        int maxSum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (!used[i][j] && g[i][j] > 0) {
//                    int sum = g[i][j];
                    int sum = 0;
                    // used[i][j] = true;
                    int[] qx = new int[100];
                    int[] qy = new int[100];
                    int nq = 0;
                    int cur = 0;
                    qx[cur] = i;
                    qy[cur] = j;
                    while (cur <= nq) {
                        if (cur > 1001) break;
                        int nx = qx[cur];
                        int ny = qy[cur];
                        if (g[nx][ny] == 0 || used[nx][ny]) {
                            cur++;
                            continue;
                        };
                        sum += g[nx][ny];
                        g[nx][ny] = 0;
                        used[nx][ny] = true;
                        if (nx + 1 < n && !used[nx + 1][ny] && g[nx + 1][ny] > 0) {
                            nq++;
                            qx[nq] = nx + 1;
                            qy[nq] = ny;
                        }
                        if (nx - 1 >= 0 && !used[nx - 1][ny] && g[nx - 1][ny] > 0) {
                            nq++;
                            qx[nq] = nx - 1;
                            qy[nq] = ny;
                        }
                        if (ny - 1 >= 0 && !used[nx][ny - 1] && g[nx][ny - 1] > 0) {
                            nq++;
                            qx[nq] = nx;
                            qy[nq] = ny - 1;
                        }
                        if (ny + 1 < m && !used[nx][ny + 1] && g[nx][ny + 1] > 0) {
                            nq++;
                            qx[nq] = nx;
                            qy[nq] = ny + 1;
                        }
                        cur++;
                    }
                    if (maxSum < sum) maxSum = sum;
                }
            }
        return maxSum;
    }


}
