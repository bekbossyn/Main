public class GetSubarrayBeauty {

    public int[] getSubarrayBeauty(int[] ns, int k, int x) {
        int[] cs = new int[101];
        int len = ns.length;
        int[] ks = new int[len-k+1];
        int lenK = 0;
        for (int i = 0; i < len; i++) ns[i] += 50;

        for (int i = 0; i < k; i++) cs[ns[i]]++;
        int ci = 0;
        for (int i = k; i <= len; i++) {
            int xx = x;
            int j = 0;
            for (j = 0; j < 101; j++) {
                if (cs[j] >= xx) {
                    ci = i;
                    break;
                }
                xx -= cs[j];
            }
//            ks[ci - k] = Math.min(j - 50, 0);
//            ks[ci - k] = j-50;
            ks[ci - k] = Math.min(j-50, 0);
            cs[ns[i - k]]--;
            if (i + 1 <= len)
                cs[ns[i]]++;
        }

        return ks;
    }

}
