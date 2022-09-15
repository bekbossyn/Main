public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length() / 2; i++)
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
