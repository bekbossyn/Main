import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {

    class Cache {
        int startIndex, endIndex, count;

        Cache(int start, int end) {
            this.startIndex = start;
            this.endIndex = end;
            this.count = 1;
        }

        int diff() {
            return endIndex - startIndex + 1;
        }
    }

    public int findShortestSubArray(int[] ns) {
        HashMap<Integer, Cache> h = new HashMap<>();
        for (int i = 0; i < ns.length; i++) {
            if (h.containsKey(ns[i])) {
                Cache c = h.get(ns[i]);
                c.count++;
                if (c.endIndex < i) {
                    c.endIndex = i;
                }
                h.put(ns[i], c);
            } else {
                h.put(ns[i], new Cache(i, i));
            }
        }

        int cnt = 0;
        int diff = 0;
        for (Map.Entry<Integer, Cache> t : h.entrySet()) {
            Cache c = t.getValue();
            if (c.count > cnt) {
                cnt = c.count;
                diff = c.diff();
            } else if (c.count == cnt) {
                if (diff > c.diff())
                    diff = c.diff();
            }
        }
        return diff;
    }


}
