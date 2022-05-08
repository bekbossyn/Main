import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramMappings {

    public int[] anagramMappings(int[] ns1, int[] ns2) {
        int[] res = new int[ns2.length];
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < ns2.length; i++) h.put(ns2[i], i);
        int t = 0;
        for (int n : ns1) res[t++] = h.get(n);
        return res;
    }

}
