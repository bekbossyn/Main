import java.util.HashMap;
import java.util.Hashtable;

public class MostFrequent {

    public int mostFrequent(int[] ns, int key) {
        int i = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        while (i <= ns.length - 2) {
            if (ns[i] == key) {
                h.put(ns[i + 1], h.getOrDefault(ns[i + 1], 0) + 1);
            }
            i++;
        }
        int number = -1;
        int cnt = -1;
        for (int j = 0; j < ns.length; j++) {
            if (h.containsKey(ns[j])) {
                if (h.get(ns[j]) > cnt) {
                    number = ns[j];
                    cnt = h.remove(ns[j]);
                }
            }
        }
        return number;
    }

}
