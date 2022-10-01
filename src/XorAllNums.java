import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

public class XorAllNums {

    public int xorAllNums(int[] ns1, int[] ns2) {
        int len1 = ns1.length, len2 = ns2.length;
        if (len1 % 2 == 0 && len2 % 2 == 0) return 0;
        int res = 0;
        if (len2 % 2 == 1) {
            for (int i : ns1)
                res ^= i;
        }
        if (len1 % 2 == 1)
            for (int i : ns2)
                res ^= i;
        return res;
    }

}
