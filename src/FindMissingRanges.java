import java.util.ArrayList;
import java.util.List;

public class FindMissingRanges {

    public List<String> findMissingRanges(int[] ns, int l, int r) {
        List<String> list = new ArrayList<>();
        int p = l - 1;
        for (int i = 0; i <= ns.length; i++) {
            int c = (i < ns.length) ? ns[i] : r + 1;
            if (p + 1 <= c - 1)
                list.add(f(p + 1, c - 1));
            p = c;
        }
        return list;
    }

    private String f(int l, int r) {
        if (l == r) return String.valueOf(l);
        return l + "->" + r;
    }

}
