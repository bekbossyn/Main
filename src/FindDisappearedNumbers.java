import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] ns) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < ns.length; i++) {
            while (ns[i] != i + 1) {
                int t = ns[ns[i] - 1];
                ns[ns[i] - 1] = ns[i];
                ns[i] = t;
                if (ns[i] == ns[ns[i] - 1]) {
                    break;
                }
            }
        }
        for (int i = 0; i < ns.length; i++) {
            if (ns[i] != i + 1)
                l.add(i + 1);
        }
        return l;
    }

}
