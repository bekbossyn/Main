import java.util.Arrays;
import java.util.Collections;

public class MaxSubsequence {

    static class Pair {
        int index;
        int num;

        Pair(int index, int num) {
            this.index = index;
            this.num = num;
        }

        static int compare(Pair p1, Pair p2) {
//            if (p1.num == p2.num) return p1.index - p2.index;
            return p1.num - p2.num;
        }

        static int compareByIndex(Pair p1, Pair p2) {
            return p1.index - p2.index;
        }
    }

    public int[] maxSubsequence(int[] ns, int k) {
        int len = ns.length;
        Pair[] numbers = new Pair[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = new Pair(i, ns[i]);
        }
        Arrays.sort(numbers, Pair::compare);
        Arrays.sort(numbers, len - k, len, Pair::compareByIndex);
        int[] result = new int[k];
        for (int i = len - k; i < len; i++) {
            result[i - len + k] = numbers[i].num;
        }
        return result;
    }

}
