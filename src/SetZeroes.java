import java.util.Arrays;

public class SetZeroes {

    public void setZeroes(int[][] ms) {
        int row = 0, col = 0;
        boolean found = false;
        for (int i = 0; i < ms.length; i++)
            for (int j = 0; j < ms[0].length; j++) {
                if (ms[i][j] == 0) {
                    if (!found) {
                        found = true;
                        row = i;
                        col = j;
                    }
                    ms[row][j] = 0;
                    ms[i][col] = 0;
                }
            }
        System.out.println(Arrays.deepToString(ms));
        if (found) {
            for (int i = 0; i < ms.length; i++) {
                for (int j = 0; j < ms[0].length; j++)
                    if (row != i && col != j) {
                        if (ms[row][j] == 0 || ms[i][col] == 0) {
                            ms[i][j] = 0;
                        }
                    }
            }
            for (int i = 0; i < ms.length; i++) ms[i][col] = 0;
            for (int j = 0; j < ms[0].length; j++) ms[row][j] = 0;
        }
    }

}
