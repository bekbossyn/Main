public class CountPairs {

    public int countPairs(int[] ns, int k) {
        int cnt = 0;
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = i + 1; j < ns.length; j++) {
                if (ns[i] == ns[j]) {
                    if (i * j % k == 0) cnt++;
                }
            }
        }
        return cnt;
    }

}
