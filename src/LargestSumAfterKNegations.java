import java.util.Arrays;
import java.util.Map;

public class LargestSumAfterKNegations {

    public int largestSumAfterKNegations(int[] ns, int k) {
        int len = ns.length;
//        k %= len;
        Arrays.sort(ns);
        for (int i = 0; i < len; i++) {
            if (k == 0 || ns[i] > 0) break;
            ns[i] = -ns[i];
            k--;
        }
        if (k % 2 == 0) return getSum(ns);

        for (int n : ns)
            if (n == 0) {
                return getSum(ns);
            }
        int min = 101;
        int index = -1;
        for (int i = 0; i < ns.length; i++) {
            if (Math.abs(ns[i]) < min) {
                min = ns[i];
                index = i;
            }
        }
        ns[index] = -ns[index];
        return getSum(ns);

    }

    int getSum(int[] ns) {
        int sum = 0;
        for (int n : ns) sum += n;
        return sum;
    }

}
