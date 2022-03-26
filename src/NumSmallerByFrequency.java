public class NumSmallerByFrequency {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] w = new int[words.length];
        int[] q = new int[queries.length];
        for (int i = 0; i < queries.length; i++) q[i] = f(queries[i]);
        for (int i = 0; i < words.length; i++) w[i] = f(words[i]);
        for (int i = 0; i < q.length; i++)
            for (int j = 0; j < w.length; j++) {
                if (w[j] > q[i]) ans[i]++;
            }
        return ans;
    }

    int f(String w) {
        char c = w.charAt(0);
        int cnt = 0;
        for (int i = 1; i < w.length(); i++)
            if (c > w.charAt(i)) {
                c = w.charAt(i);
            }
        for (int i = 0; i < w.length(); i++) {
            if (c == w.charAt(i)) cnt++;
        }
        return cnt;
    }

}
