import java.util.HashMap;

public class ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] ns, int k) {
        int i = -1;
        HashMap<Integer, Integer> h = new HashMap<>();
        while (i < ns.length - 1) {
            i++;
            if (i - k - 1 >= 0) {
                int num = h.getOrDefault(ns[i - k - 1], 0);
                if (num > 0) {
                    h.put(ns[i - k - 1], h.get(ns[i - k - 1]) - 1);
                }
            }
            h.put(ns[i], h.getOrDefault(ns[i], 0) + 1);
            if (h.get(ns[i]) > 1) return true;
        }
        return false;
    }

}
