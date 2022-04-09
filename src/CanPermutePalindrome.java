import java.util.HashMap;
import java.util.Hashtable;

public class CanPermutePalindrome {

    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char ch : s.toCharArray()) {
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }
        if (s.length() % 2 == 0) {
            for (char c : s.toCharArray())
                if (h.get(c) % 2 == 1) return false;
        } else {
            boolean used = false;
            for (char c : s.toCharArray())
                if (h.containsKey(c) && h.get(c) % 2 == 1) {
                    if (used) return false;
                    else {
                        used = true;
                        h.remove(c);
                    }
                }
        }
        return true;
    }
}
