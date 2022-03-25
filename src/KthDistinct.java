import java.util.HashMap;

public class KthDistinct {

    public String kthDistinct(String[] a, int k) {
        int cnt = 0;
        HashMap<String, Integer> h = new HashMap<>();
        for (String w : a) h.put(w, h.getOrDefault(w, 0) + 1);
        for (String w : a)
            if (h.get(w) == 1) {
                cnt++;
                if (cnt == k) return w;
            }
        return "";
    }

}
