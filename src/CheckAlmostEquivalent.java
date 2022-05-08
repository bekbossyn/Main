import java.util.HashMap;

public class CheckAlmostEquivalent {

    public boolean checkAlmostEquivalent(String w1, String w2) {

        HashMap<Character, Integer> h = new HashMap<>();
        for (char ch : w1.toCharArray()) h.put(ch, h.getOrDefault(ch, 0) + 1);
        for (char ch : w2.toCharArray()) h.put(ch, h.getOrDefault(ch, 0) - 1);
        for (int i : h.values()) if (Math.abs(i) > 3) return false;
        return true;
    }

}
