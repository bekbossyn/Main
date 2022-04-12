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

}
