public class NumMatchingSubseq {

    public int numMatchingSubseq(String s, String[] words) {
        int cnt = 0;
        for (String w : words) {
            int si = 0, wi = 0;
            while (si < s.length() && wi < w.length()) {
                if (s.charAt(si) == w.charAt(wi)) {
                    si++;
                    wi++;
                } else {
                    si++;
                }
            }
            if (wi >= w.length()) cnt++;

        }
        return cnt;
    }

}
