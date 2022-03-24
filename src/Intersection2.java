import java.util.HashMap;

public class Intersection2 {

    public int[] intersect(int[] ns1, int[] ns2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : ns1) {
            if (!h.containsKey(i)) h.put(i, 1);
            else h.put(i, h.get(i) + 1);
        }

        int cnt = 0;
        for (int n : ns2)
            if (h.containsKey(n) && h.get(n) > 0) {
                ns1[cnt++] = n;
                h.put(n, h.get(n) - 1);
            }
        int[] m = new int[cnt];
        System.arraycopy(ns1, 0, m, 0, cnt);
        return m;
    }

}
