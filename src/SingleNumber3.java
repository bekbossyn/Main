import java.util.HashMap;

public class SingleNumber3 {

    public int[] singleNumber(int[] ns) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        for (int n : ns) {
            if (h.containsKey(n)) {
                h.remove(n);
            } else {
                h.put(n, true);
            }
        }
        int[] pair = new int[2];
        int cnt = 0;
        for (int n : ns) {
            if (h.containsKey(n)) {
                pair[cnt++] = n;
            }
        }
        return pair;
    }

}
