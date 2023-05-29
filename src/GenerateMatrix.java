public class GenerateMatrix {

    int[][] d = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int x = 0, y = 0, xy = 0;
        result[x][y] = 1;
        for (int i = 2; i <= n * n; i++) {
            int nx = x + d[xy][0];
            int ny = y + d[xy][1];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || result[nx][ny] != 0) {
                xy = (xy + 1) % d.length;
                nx = x + d[xy][0];
                ny = y + d[xy][1];
            }
            result[nx][ny] = i;
            x = nx;
            y = ny;
        }
        return result;
    }

}
