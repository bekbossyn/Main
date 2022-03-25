import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int[][] b = new int[10][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') b[i + 1][j + 1] = board[i][j] - 48;
            }
        }
        // check horizontal
        for (int i = 1; i < 10; i++) {
            HashSet<Integer> h = new HashSet<>();
            for (int k = 1; k < 10; k++) h.add(k);
            for (int j = 1; j < 10; j++) {
                if (b[i][j] != 0) {
                    if (h.contains(b[i][j])) {
                        h.remove(b[i][j]);
                    } else return false;
                }
            }
        }
        // check vertical
        for (int i = 1; i < 10; i++) {
            HashSet<Integer> h = new HashSet<>();
            for (int k = 1; k < 10; k++) h.add(k);
            for (int j = 1; j < 10; j++) {
                if (b[j][i] != 0) {
                    if (h.contains(b[j][i])) {
                        h.remove(b[j][i]);
                    } else return false;
                }
            }
        }
        // check boxes
        for (int i = 1; i < 10; i += 3) {
            HashSet<Integer> h = new HashSet<>();
            for (int k = 1; k < 10; k++) h.add(k);
            for (int ii = i; ii < i+3; ii++) {
                for (int j = 1; j < 4; j++) {
                    if (b[ii][j] != 0) {
                        if (h.contains(b[ii][j])) {
                            h.remove(b[ii][j]);
                        } else return false;
                    }
                }
            }
            h = new HashSet<>();
            for (int k = 1; k < 10; k++) h.add(k);
            for (int ii = i; ii < i+3; ii++) {
                for (int j = 4; j < 7; j++) {
                    if (b[ii][j] != 0) {
                        if (h.contains(b[ii][j])) {
                            h.remove(b[ii][j]);
                        } else return false;
                    }
                }
            }
            h = new HashSet<>();
            for (int k = 1; k < 10; k++) h.add(k);
            for (int ii = i; ii < i+3; ii++) {
                for (int j = 7; j < 10; j++) {
                    if (b[ii][j] != 0) {
                        if (h.contains(b[ii][j])) {
                            h.remove(b[ii][j]);
                        } else return false;
                    }
                }
            }

        }
        return true;
    }

}
