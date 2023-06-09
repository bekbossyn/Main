import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutive {

    public int longestConsecutive(int[] ns) {
        int len = ns.length;
        if (len == 0) return 0;
        if (len == 1) return 1;
        Arrays.sort(ns);
        List<Integer> list = new ArrayList<>();
        list.add(ns[0]);
        for (int i = 1; i < ns.length; i++) {
            if (ns[i] != ns[i - 1]) list.add(ns[i]);
        }
        len = list.size();
        int[] b = new int[len];

        Arrays.fill(b, 1);
        int max = 1;
        for (int i = 1; i < len; i++) {
            if (list.get(i) == list.get(i - 1) + 1) {
                b[i] = b[i - 1] + 1;
                max = Math.max(max, b[i]);
            }
        }
        return max;
    }

}
