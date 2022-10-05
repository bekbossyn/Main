import java.util.HashMap;

public class CountNicePairs {

    int reverse(int n) {
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }

    public int countNicePairs(int[] ns) {
        int len = ns.length;
        long cnt = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int key = ns[i] - reverse(ns[i]);
            int cur;
            cur = h.getOrDefault(key, 0);
            cnt += cur;
            h.put(key, h.getOrDefault(key, 0) + 1);
        }
        return (int) (cnt % 1000000007);
    }

}
