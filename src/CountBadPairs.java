import java.util.HashMap;

public class CountBadPairs {

    public long countBadPairs(int[] ns) {
        int len = ns.length;
        long cnt = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int key = ns[i] - i;
            if (!h.containsKey(key)) h.put(key, 0);
            else h.put(key, h.get(key) + 1);
            cnt += i - h.get(key);
        }
        return cnt;
    }
    
}
