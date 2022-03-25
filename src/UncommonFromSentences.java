import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UncommonFromSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> h = new HashMap<>();
        String[] a1 = (s1 + " " + s2).split(" ");
        for (String s : a1) h.put(s, h.getOrDefault(s, 0) + 1);
        List<String> a = new ArrayList<>();
        for (String s : a1) if (h.get(s) == 1) a.add(s);
        return a.toArray(new String[a.size()]);
    }

}
