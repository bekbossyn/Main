import java.time.LocalDateTime;
import java.util.Arrays;

public class KthPalindrome {

    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] ans = new long[queries.length];
        int
        for (int i = 0; i < queries.length; i++) {
            if (9 * (long) Math.pow(10, (double) ((intLength - 1) / 2)) < queries[i]) {
                ans[i] = -1;
            } else {
                long num = 1;

                num = (long) Math.pow(10, (double) ((intLength - 1) / 2));

                num = num + queries[i] - 1;

                String s = Long.toString(num);
                if (intLength % 2 == 1) s = s.substring(0, s.length() - 1);
                s = new StringBuilder(s).reverse().toString();
                s = num + s;
                ans[i] = Long.parseLong(s);
            }
        }
        return ans;
    }

}
