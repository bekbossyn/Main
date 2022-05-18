public class PrefixCount {

    public int prefixCount(String[] ws, String p) {
        int cnt = 0;
        for (String w : ws) {
            if (w.length() >= p.length()) {
                if (w.substring(0, p.length()).contains(p)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
