import java.util.HashMap;

public class CanConstruct {
    public boolean canConstruct(String rN, String m) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : m.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        for (char c : rN.toCharArray()) {
            if (h.getOrDefault(c, 0) == 0) {
                return false;
            }
            h.put(c, h.get(c) - 1);
        }
        return true;
    }
}
