import java.util.HashMap;

public class IsAlienSorted {

    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < order.length(); i++) h.put(order.charAt(i), i);
        for (int i = 0; i < words.length - 1; i++)
            if (!compare(words[i], words[i + 1], h))
                return false;
        return true;
    }

    public boolean compare(String s1, String s2, HashMap<Character, Integer> h) {
        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            if (h.get(s1.charAt(i)) > h.get(s2.charAt(i))) return false;
            else if (h.get(s1.charAt(i)) < h.get(s2.charAt(i))) return true;

        }
        return s1.length() <= s2.length();
    }

}
