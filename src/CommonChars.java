import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonChars {

    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> h = new HashMap<>();
        String w = words[0];
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (!h.containsKey(c)) h.put(c, 0);
            h.put(c, h.get(c) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            w = words[i];
            HashMap<Character, Integer> nh = new HashMap<>();
            for (int j = 0; j < w.length(); j++) {
                char c = w.charAt(j);
                if (!nh.containsKey(c)) nh.put(c, 0);
                nh.put(c, nh.get(c) + 1);
            }
            w = words[0];
            String nw = "";
            for (int j = 0; j < w.length(); j++) {
                char c = w.charAt(j);
                nw = nw + String.valueOf(c);
                if (h.containsKey(c) && !nh.containsKey(c)) {
                    h.remove(c);
                    // delete last element
                    nw = nw.substring(0, nw.length() - 1);
                }
                if (h.containsKey(c) && nh.containsKey(c)) {
                    h.put(c, Math.min(h.get(c), nh.get(c)));
                }
            }
            words[0] = nw;
        }
        List<String> l = new ArrayList<>();
        w = words[0];
        for (int i = 0; i < w.length(); i++){
            char c = w.charAt(i);
            if (h.containsKey(c)){
                for (int j = 0; j < h.get(c); j++)
                    l.add(String.valueOf(c));
                h.remove(c);
            }
        }
        return l;
    }

}
