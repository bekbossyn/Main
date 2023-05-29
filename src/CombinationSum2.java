import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] cs, int t) {
        Arrays.sort(cs);
        List<List<Integer>> result = new ArrayList<>();
        rec(0, cs, t, new ArrayList<>(), result);
        return result;
    }

    private void rec(int curIndex, int[] cs, int left, List<Integer> current, List<List<Integer>> result) {
        if (left < 0) return;
        if (left == 0) {
            if (!result.contains(current))
                result.add(new ArrayList<>(current));
            return;
        }
        for (int i = curIndex; i < cs.length; i++) {
            if (i != curIndex && cs[i] == cs[i - 1]) continue;
            if (cs[i] > left) break;
            if (left - cs[i] >= 0) {
                current.add(cs[i]);
                rec(i + 1, cs, left - cs[i], current, result);
                current.remove(current.size() - 1);
            }
        }
    }

}
