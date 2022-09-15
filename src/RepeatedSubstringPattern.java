public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        for (int i = (s.length() + 1) / 2; i > 0 ; i--)
            if (check(s, i))
                return true;
        return false;
    }

    boolean check(String s, int len) {
        StringBuilder st = new StringBuilder(s.substring(0, len));
        while (st.length() < s.length()) {
            st.append(s.substring(0, len));
        }
        return st.toString().equals(s);
    }

}
