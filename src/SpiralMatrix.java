import java.util.Arrays;

public class SpiralMatrix {

    int[][] d = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] spiralMatrix(int n, int m, ListNode head) {
        int[][] ns = new int[n][m];
        for (int[] row : ns)
            Arrays.fill(row, -1);
        int x = 0, y = 0, xy = 0;
        ns[x][y] = head.val;
        head = head.next;
        while (head != null) {
            int nx, ny;
            nx = x + d[xy][0];
            ny = y + d[xy][1];
            if (nx < 0 || ny < 0 || nx >= n || ny >= m || ns[nx][ny] != -1) {
                xy = (xy + 1) % d.length;
                nx = x + d[xy][0];
                ny = y + d[xy][1];
            }
            ns[nx][ny] = head.val;
            x = nx;
            y = ny;
            head = head.next;

        }
        return ns;
    }

}
