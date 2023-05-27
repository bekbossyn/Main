import java.util.Arrays;

public class MaxStrength {

    public long maxStrength(int[] ns) {
        int len = ns.length;
        if (len == 1) return ns[0];
        int pos = 0, neg = 0, zer = 0;
        Arrays.sort(ns);
        for (int i = 0; i < len; i++) {
            if (ns[i] == 0) zer++;
            else if (ns[i] > 0) pos++;
            else neg++;
        }
        long res = 0;

        // positive
        if (pos > 0) {
            res = ns[len - 1];
            for (int i = 0; i < len - 1; i++)
                if (ns[i] > 0) res *= ns[i];
            if (neg > 1) {
                int k = 0;
                while (neg > 1) {
                    neg -= 2;
                    res *= ns[k];
                    res *= ns[k + 1];
                    k += 2;
                }
                return res;
            } else return res;
        } else {
            if (neg > 1) {
                res = (long) ns[0] * ns[1];
                neg -= 2;
                int k = 2;
                while (neg > 1) {
                    neg -= 2;
                    res *= ns[k];
                    res *= ns[k + 1];
                    k += 2;
                }
                return res;
            } else {
                if (zer > 0) return 0;
                else return ns[len - 1];
            }
        }
    }

}
