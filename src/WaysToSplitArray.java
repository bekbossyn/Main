import java.util.Arrays;

public class WaysToSplitArray {

    public int waysToSplitArray(int[] ns) {
        int len = ns.length;
        long[] b = new long[len];
        long[] c = new long[len];
        c[0] = ns[0];
        b[len - 1] = ns[len - 1];
        for (int i = len - 2; i >= 0; i--) b[i] += ns[i] + b[i + 1];
        for (int i = 1; i < len; i++) c[i] = ns[i] + c[i - 1];
        int cnt = 0;
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));
        for (int i = 0; i < len - 1; i++) {
            if (c[i] >= b[i + 1]) cnt++;
        }
        return cnt;
    }

}
