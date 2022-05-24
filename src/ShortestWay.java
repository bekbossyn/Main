public class ShortestWay {

    int get(String s, String t) {
        int si = 0, ti = 0;
        while (si < s.length() && s.charAt(si) != t.charAt(ti)) si++;
        if (si == s.length())
            return -1;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
                ti++;
            } else {
                si++;
            }
        }
        return ti;
    }

    public int shortestWay(String s, String t) {
        int cnt = 0;
        while (true) {
            cnt++;
            int res = get(s, t);
            if (res == -1) return -1;
            if (res >= t.length()) break;
            t = t.substring(res);
        }
        return cnt;
    }

}
