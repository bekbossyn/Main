public class RemoveTrailingZeros {

    public String removeTrailingZeros(String s) {
        while (s.length() > 1 && s.charAt(s.length() - 1) == '0') {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }
}