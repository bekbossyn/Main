import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : ns) h.put(n, h.getOrDefault(n, 0) + 1);
        for (int n : ns) if (h.get(n) > ns.length / 2) return n;
        return 0;
    }

}
