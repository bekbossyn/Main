public class RotateString {

    public boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i) + s.substring(0, i);
            if (ss.compareTo(goal) == 0) return true;
        }
        return false;
    }

}
