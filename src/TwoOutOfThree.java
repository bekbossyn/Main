import java.util.*;

public class TwoOutOfThree {

    public List<Integer> twoOutOfThree(int[] ns1, int[] ns2, int[] ns3) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : ns1) {
            h.put(n, 1);
//            hh.add(n);
        }
        HashSet<Integer> hh = new HashSet<>();
        for (int n : ns2) {
            if (!hh.contains(n)) {
                h.put(n, h.getOrDefault(n, 0) + 1);
            }
            hh.add(n);
        }
        HashSet<Integer> hhh = new HashSet<>();
        for (int n : ns3) {
            if (!hhh.contains(n)) {
                h.put(n, h.getOrDefault(n, 0) + 1);
            }
            hhh.add(n);
        }
        for (Map.Entry<Integer, Integer> i : h.entrySet()) {
            if (i.getValue() >= 2) l.add(i.getKey());
        }

        return l;
    }

}
