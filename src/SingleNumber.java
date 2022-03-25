import java.util.HashMap;
import java.util.Stack;

public class SingleNumber {

    public int singleNumber(int[] ns) {
        int x = 0;
        for (int n : ns) {
            x = x ^ n;
        }
        return x;
    }

    /*
    public int singleNumber(int[] ns) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        for (int n : ns) {
            if (h.containsKey(n)) {
                h.remove(n);
            } else {
                h.put(n, true);
            }
        }
        for (int n : ns) if (h.containsKey(n)) return n;
        return 0;
    }
     */

}
