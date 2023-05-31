import java.util.Arrays;
import java.util.HashMap;

public class CustomSortString {
    HashMap<Character, Integer> h;

    class Pair {

        char a;
        int index;

        Pair(char a) {
            this.a = a;
            this.index = h.get(a);
        }

        public static int compare(Pair p1, Pair p2) {
            return p1.index - p2.index;
        }

    }

    public String customSortString(String order, String s) {
        h = new HashMap<>();
        StringBuilder comp = new StringBuilder(order);
        for (char c = 'a'; c <= 'z'; c++)
            if (!order.contains(c + "")) {
                comp.append(c);
            }
        order = comp.toString();
        for (int i = 0; i < 26; i++) {
            h.put(order.charAt(i), i);
        }

        Pair[] pairs = new Pair[s.length()];
        for (int i = 0; i < s.length(); i++) {
            pairs[i] = new Pair(s.charAt(i));
        }
        Arrays.sort(pairs, Pair::compare);
        comp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            comp.append(pairs[i].a);
        }
        return comp.toString();
    }

}
