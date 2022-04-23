import java.util.HashMap;
import java.util.Map;

public class AreOccurrencesEqual {

    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        HashMap<Character, Integer> k = new HashMap<>();
        for (char ch : s.toCharArray()) {
            h.put(ch, h.getOrDefault(ch, 0) + 1);
            k.put(ch, k.getOrDefault(ch, 1));
        }
        int c = h.get(s.charAt(0));
        for (Map.Entry<Character, Integer> cc : h.entrySet()) {
            if (cc.getValue()!=c) return false;
        }
        return true;
    }

}
