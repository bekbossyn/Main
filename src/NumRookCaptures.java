public class NumRookCaptures {

    public int numRookCaptures(char[][] b) {
        int cnt = 0;
        int rx = 0, ry = 0;
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[0].length; j++)
                if (b[i][j] == 'R') {
                    rx = i;
                    ry = j;
                    break;
                }

        cnt += search(rx, ry, 1, 0, b) +
                search(rx, ry, -1, 0, b) +
                search(rx, ry, 0, 1, b) +
                search(rx, ry, 0, -1, b);
        return cnt;
    }

    int search(int px, int py, int x, int y, char[][] b) {
        if (px + x < 0 || px + x >= b.length || py + y < 0 || py + y >= b[0].length) return 0;
        if (b[px + x][py + y] == '.') return search(px + x, py + y, x, y, b);
        else if (b[px + x][py + y] == 'p') return 1;
        else
            return 0;
    }

}
