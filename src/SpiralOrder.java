import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    int[][] d = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> answer = new ArrayList<>();
        helper(0, 0, 0, answer, mat);
        return answer;
    }

    private void helper(int x, int y, int dx, List<Integer> answer, int[][] mat) {
        answer.add(mat[x][y]);
        mat[x][y] = 101;
        int nx = x + d[dx][0];
        int ny = y + d[dx][1];
        if (nx < 0 || nx >= mat.length || ny < 0 || ny >= mat[0].length || mat[nx][ny] == 101) {
            dx = (dx + 1) % 4;
            nx = x + d[dx][0];
            ny = y + d[dx][1];
        }
        if (!(nx < 0 || nx >= mat.length || ny < 0 || ny >= mat[0].length || mat[nx][ny] == 101)) {
            helper(nx, ny, dx, answer, mat);
        }
    }

}
