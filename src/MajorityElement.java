import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {

    public int majorityElement(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : ns) h.put(n, h.getOrDefault(n, 0) + 1);
        for (int n : ns) if (h.get(n) > ns.length / 2) return n;
        return 0;
    }

    public List<Integer> MajorityElement(int[] ns) {
        List l = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : ns) h.put(n, h.getOrDefault(n, 0) + 1);
        for (int n : ns) {
            if (h.containsKey(n)) {
                if (h.get(n) > ns.length / 3) l.add(n);
                h.remove(n);
            }
        }
        return l;
    }


}
