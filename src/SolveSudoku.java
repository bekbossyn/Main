/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      21:40:02
*/


public class SolveSudoku {

    public void solveSudoku(char[][] b) {
        solve(b, 0, 0);
    }

    private boolean solve(char[][] b, int i, int j) {
        // end of the game
        if (i == b.length) return true;
        // next row
        if (j == b[0].length) return solve(b, i + 1, 0);
        // skip filled cells
        if (b[i][j] != '.') return solve(b, i, j + 1);

        for (char c = '1'; c <= '9'; c++) {
            if (valid(b, i, j, c)) {
                b[i][j] = c;
                if (solve(b, i, j + 1)) return true;
                b[i][j] = '.';
            }
        }
        return false;
    }

    private boolean valid(char[][] b, int i, int j, char num) {
        for (int ii = 0; ii < b.length; ii++) {
            if (b[i][ii] == num) return false;
            if (b[ii][j] == num) return false;
            // Check 3x3 subgrid
            int si = 3 * (i / 3) + ii / 3; // Calculate row index of subgrid
            int sj = 3 * (j / 3) + ii % 3; // Calculate column index of subgrid
            if (b[si][sj] == num) return false;
        }
        return true;
    }

}
