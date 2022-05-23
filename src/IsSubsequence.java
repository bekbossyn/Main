public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0;
        while (si < s.length()) {
            while (ti < t.length() && s.charAt(si) != t.charAt(ti)) ti++;
            if (ti == t.length()) return false;
            si++;
            ti++;

        }
        return si == s.length();
    }

}
