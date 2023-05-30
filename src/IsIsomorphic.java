import java.util.HashMap;

public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> h = new HashMap<>();
        HashMap<Character, Boolean> used = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (h.containsKey(s.charAt(i))) {
            } else {
                if (used.containsKey(t.charAt(i))) return false;
                h.put(s.charAt(i), t.charAt(i));
                used.put(t.charAt(i), true);
            }
            sb.append(h.get(s.charAt(i)));
        }
        String sbs = sb.toString();
        return sbs.equals(t);
    }

}
