import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split("\\s+");
        HashMap<Character, String> h = new HashMap<>();
        HashMap<String, Boolean> used = new HashMap<>();
        if (pattern.length() != split.length) return false;
        for (int i = 0; i < split.length; i++) {
            if (h.containsKey(pattern.charAt(i))) {
                if (!h.get(pattern.charAt(i)).equals(split[i])) return false;
            } else {
                if (used.containsKey(split[i])) return false;
                h.put(pattern.charAt(i), split[i]);
                used.put(split[i], true);
            }
        }
        return true;
    }

}
