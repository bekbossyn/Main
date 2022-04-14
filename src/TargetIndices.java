import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {

    public List<Integer> targetIndices(int[] ns, int t) {
        Arrays.sort(ns);
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < ns.length; i++)
            if (ns[i] == t) l.add(i);
        return l;
    }

}
