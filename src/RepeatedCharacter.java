import java.util.HashMap;

public class RepeatedCharacter {

    public char repeatedCharacter(String s) {
        HashMap<Character, Boolean> h = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (h.containsKey(ch)) {
                return ch;
            } else {
                h.put(ch, true);
            }
        }
        return ' ';
    }

}
