import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber {
    public int missingNumber(int[] ns) {
        int sum = ns.length * (ns.length + 1) / 2;
        for (int n : ns) sum -= n;
        return sum;
    }
    /* slow
    public int missingNumber(int[] ns) {
        HashMap <Integer,Boolean> h = new HashMap<>();
        for (int n:ns) h.put(n, true);
        for (int i = 0; i <= ns.length; i++)
            if (!h.containsKey(i)) return i;
        return 0;
    }
     */

}
