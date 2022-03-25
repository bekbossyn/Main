import java.util.HashMap;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] a = paragraph.split("\\W+");// means only letters
        HashMap<String, Integer> h = new HashMap<>();
        for (String w : a) {
            h.put(w.toLowerCase(), h.getOrDefault(w.toLowerCase(), 0) + 1);
        }
        for (String w : banned) h.remove(w.toLowerCase());
        String s = "";
        int maxAppearance = 0;
        for (String w : a)
            if (h.containsKey(w.toLowerCase())) {
                if (h.get(w.toLowerCase()) > maxAppearance) {
                    maxAppearance = h.get(w.toLowerCase());
                    s = w.toLowerCase();
                }
            }
        return s;
    }

}
