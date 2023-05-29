public class MaxSubArray {

    public int maxSubArray(int[] ns) {
        int len = ns.length;
        int[] v = new int[len];
        int max = ns[0];
        v[0] = ns[0];
        for (int i = 1; i < len; i++) {
            v[i] = Math.max(ns[i], ns[i] + v[i - 1]);
            max = Math.max(max, v[i]);
        }
        return max;
    }

}
