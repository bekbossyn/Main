public class LongestContinuousSubstring {

    public int longestContinuousSubstring(String s) {

        String ss = "abcdefghijklmnopqrstuvwxyz";
        int max = 1;
        for (int i = 0; i < 26; i++) {
            for (int j = 26; j > i; j--)
                if (j - i <= s.length()) {
                    String q = ss.substring(i, j);
                    // System.out.println(q);
                    if (s.contains(q)) max = Math.max(max, j - i);
                    if (max == 26) return max;
                }
        }
        return max;
    }

}
