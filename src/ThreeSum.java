import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] ns) {
        List<List<Integer>> result = new ArrayList<>();

        int zeros = 0;
        for (int n : ns) if (n == 0) zeros++;
        int len = ns.length;
        if (len < 3) return result;
        if (zeros == len) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(0);
            list.add(0);
            result.add(list);
            return result;
        }

        Arrays.sort(ns);
        for (int i = 0; i < len - 2; i++) {
            int l = i + 1, r = len - 1;
            while (l < r) {
                int sum = ns[l] + ns[i] + ns[r];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(ns[l]);
                    list.add(ns[i]);
                    list.add(ns[r]);
                    Collections.sort(list);
                    result.add(list);
                }
                if (sum < 0)
                    l++;
                else r--;
            }
        }

        Set<List<Integer>> set = new HashSet<>(result);
        result.clear();
        result.addAll(set);

        return result;
    }

}
