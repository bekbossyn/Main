import java.util.HashMap;
import java.util.List;

public class AreSentencesSimilar {

    public boolean areSentencesSimilar(String[] s1, String[] s2, List<List<String>> sps) {
        if (s1.length != s2.length) return false;
        for (int i = 0; i < s1.length; i++) {
            boolean found = s1[i].equals(s2[i]);
            if (!found) {
                for (List<String> sp : sps) {
                    if (s1[i].equals(sp.get(0))) {
                        if (s2[i].equals(sp.get(1))) found = true;
                    } else if (s2[i].equals(sp.get(0))) {
                        if (s1[i].equals(sp.get(1))) found = true;
                    }
                }
            }
            if (!found) return false;
        }
        return true;
    }
}
