import java.util.Arrays;

public class Rotate {

    public void rotate(int[] ns, int k) {
        int len = ns.length;
        k %= len;
        r(ns, 0, len - 1);
        r(ns, 0, k - 1);
        r(ns, k, len - 1);

    }

    public void r(int[] ns, int l, int r) {
        while (l < r) {
            int t = ns[l];
            ns[l] = ns[r];
            ns[r] = t;
            l++;
            r--;
        }
    }

    public void rotate(int[][] m) {
        int l = m.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t;
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l / 2; j++) {
                int t = m[i][j];
                m[i][j] = m[i][l - j - 1];
                m[i][l - j - 1] = t;
            }
        }

        for (int[] ints : m) System.out.println(Arrays.toString(ints));
    }

}
