import java.util.HashMap;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char cx : s.toCharArray()) c = (char) (c^cx);
        for (char cx : t.toCharArray()) c = (char) (c^cx);
        return c;
    }

    /*
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            h.put(c, h.get(c) - 1);
            if (h.get(c) == 0) h.remove(c);
        }
        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (h.containsKey(c)) return c;
        }
        return ' ';
    }
    */

}
