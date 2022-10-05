public class MaxAscendingSum {

    public int maxAscendingSum(int[] ns) {
        int cur = ns[0];
        int max = ns[0];
        int len = ns.length;
        for (int i = 1; i < len; i++) {
            if (ns[i] > ns[i - 1]) cur += ns[i];
            else {
                max = Math.max(cur, max);
                cur = ns[i];
            }
        }
        return Math.max(max, cur);
    }

}
