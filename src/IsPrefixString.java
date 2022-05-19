public class IsPrefixString {

    public boolean isPrefixString(String s, String[] words) {
        for (String w : words) {
            if (s.length() == 0) return true;
            if (s.startsWith(w)) {
                s = s.substring(w.length());
            } else {
                return false;
            }
        }
        return s.length() == 0;
    }

}
