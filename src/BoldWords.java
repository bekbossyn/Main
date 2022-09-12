public class BoldWords {

    public String boldWords(String[] ws, String s) {
        int len = s.length();
        boolean[] u = new boolean[len];
        for (String w : ws) {
            for (int i = 0; i < s.length() - w.length() + 1; i++) {
                if (s.charAt(i) == w.charAt(0)) {
                    boolean found = true;
                    for (int j = 1; j < w.length(); j++) {
                        if (s.charAt(i + j) != w.charAt(j)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        for (int j = 0; j < w.length(); j++) u[i + j] = true;
                    }
                }
            }
        }
        StringBuilder st = new StringBuilder();
        boolean bold = false;
        for (int i = 0; i < len; i++) {
            if (u[i]) {
                if (!bold) {
                    bold = true;
                    st.append("<b>");
                }
                st.append(s.charAt(i));
            } else {
                if (bold) {
                    st.append("</b>");
                    bold = false;
                }
                st.append(s.charAt(i));
            }
        }
        if (bold) {
            st.append("</b>");
        }
        return st.toString();
    }

}
