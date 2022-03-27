import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindDifference {

    public List<List<Integer>> findDifference(int[] ns1, int[] ns2) {
        HashSet<Integer> h = new HashSet<>();
        for (int n : ns2) h.add(n);
        List l1 = new ArrayList<>();
        for (int n : ns1)
            if (!h.contains(n) && !l1.contains(n)) {
                l1.add(n);
            }

        HashSet<Integer> h2 = new HashSet<>();
        for (int n : ns1) h2.add(n);
        List l2 = new ArrayList<>();
        for (int n : ns2)
            if (!h2.contains(n) && !l2.contains(n)) {
                l2.add(n);
            }
        List<List<Integer>> ll = new ArrayList<>();
        ll.add(l1);
        ll.add(l2);
        return ll;
    }

}
