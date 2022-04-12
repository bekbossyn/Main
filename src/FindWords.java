import java.util.ArrayList;
import java.util.List;

public class FindWords {

    final String f = "qwertyuiop", s = "asdfghjkl", t = "zxcvbnm";

    boolean check(String q, String keyboard) {
        q = q.toLowerCase();
        for (char c : q.toCharArray()) {
            if (keyboard.indexOf(c) < 0) return false;
        }
        return true;
    }

    public String[] findWords(String[] ws) {
        List<String> st = new ArrayList<>();
        for (String w : ws)
            if (check(w, f)) {
                st.add(w);
            } else if (check(w, s)) {
                st.add(w);
            } else if (check(w, t)) {
                st.add(w);
            }
//        String[] res = new String[];
        return st.toArray(new String[0]);
    }

}
