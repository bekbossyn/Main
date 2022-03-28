import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KWeakestRows {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] a = new int[mat.length];
        int res = 0;
        boolean[] used = new boolean[mat.length];

        for (int cnt = 0; cnt <= mat[0].length; cnt++) {
            for (int i = 0; i < mat.length; i++)
                if (!used[i]) {
                    int sum = 0;
                    for (int j = 0; j < mat[i].length; j++) sum += mat[i][j];
                    if (sum == cnt) {
                        used[i] = true;
                        a[res++] = i;
                        if (res == k) return Arrays.copyOf(a, k);
                    }
                }
        }
        return Arrays.copyOf(a, k);
    }

}
