import java.util.HashMap;

public class CheckAlmostEquivalent {

    public boolean checkAlmostEquivalent(String w1, String w2) {

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for (char ch : w1.toCharArray()) h1.put(ch, h1.getOrDefault(ch, 0) + 1);
        for (char ch : w2.toCharArray()) h2.put(ch, h2.getOrDefault(ch, 0) + 1);
        for (char ch : w1.toCharArray()) {
            int r1 = h1.getOrDefault(ch, 0);
            int r2 = h2.getOrDefault(ch, 0);
            if (Math.abs(r1 - r2) > 3) return false;
        }
        for (char ch : w2.toCharArray()) {
            int r1 = h1.getOrDefault(ch, 0);
            int r2 = h2.getOrDefault(ch, 0);
            if (Math.abs(r1 - r2) > 3) return false;
        }
        return true;
    }

}
