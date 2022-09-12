import java.util.Arrays;

public class CountValidWords {

    public int countValidWords(String s) {
        String[] ws = s.split("\\s+");
        int cnt = ws.length;
        for (String w : ws) {
            if (w.length() == 0) {
                cnt--;
                continue;
            }
            if (w.charAt(w.length() - 1) == ',' || w.charAt(w.length() - 1) == '!' || w.charAt(w.length() - 1) == '.')
                w = w.substring(0, w.length() - 1);
            if (w.length() == 0) continue;
            if (!(w.charAt(0) >= 'a' && w.charAt(0) <= 'z')) {
                cnt--;
                continue;
            }
            if (w.contains("-")) {
                if (w.charAt(w.length() - 1) == '-') {
                    cnt--;
                    continue;
                }
                if (count(w) > 1) {
                    cnt--;
                    continue;
                }
            }
            for (int i = 0; i < w.length(); i++) {
                if (!((w.charAt(i) >= 'a' && w.charAt(i) <= 'z') || (w.charAt(i) == '-'))) {
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }

    int count(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) if (c == '-') cnt++;
        return cnt;
    }

}
