import java.util.HashMap;

public class Intersection {

    public int[] intersection(int[] ns1, int[] ns2) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        for (int i : ns1) h.put(i, false);

        int cnt = 0;
        for (int n : ns2)
            if (h.containsKey(n)) if (!h.get(n)) {
                ns1[cnt++] = n;
                h.put(n, true);
            }
        int[] m = new int[cnt];
        System.arraycopy(ns1, 0, m, 0, cnt);
        return m;
    }

}
