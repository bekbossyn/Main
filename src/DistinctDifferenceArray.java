import java.util.HashMap;

public class DistinctDifferenceArray {

    public int[] distinctDifferenceArray(int[] ns) {
        int len = ns.length;
        int[] ds = new int[len];

        for (int i = 0; i < len; i++) {
            int prefix = 0;
            int suffix = 0;
            HashMap<Integer, Boolean> h = new HashMap<>();
            for (int j = 0; j <= i; j++) {
                h.put(ns[j], true);
                prefix = h.size();
            }
            HashMap<Integer, Boolean> g = new HashMap<>();
            for (int j = i + 1; j < len; j++) {

                g.put(ns[j], true);
                suffix = g.size();
            }
            ds[i] = prefix - suffix;
        }
        return ds;
    }

}
