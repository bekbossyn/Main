import java.util.HashMap;

public class CountWords {

    public int countWords(String[] ws1, String[] ws2) {
        HashMap<String, Integer> h1 = new HashMap();
        HashMap<String, Integer> h2 = new HashMap();
        for (String w : ws1) h1.put(w, h1.getOrDefault(w, 0) + 1);
        for (String w : ws2) h2.put(w, h2.getOrDefault(w, 0) + 1);
        int cnt = 0;
        for (String w : ws1) {
            if (h1.containsKey(w) && h2.containsKey(w)) {
                if (h1.get(w) == 1 && h2.get(w) == 1) {
                    cnt++;
                    h1.remove(w);
                }
            }
        }
        return cnt;
    }

}
