import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] ns) {

        List<List<Integer>> result = new ArrayList<>();

        helper(result, new ArrayList<>(), 0, ns.length, ns);

        return result;
    }

    void helper(List<List<Integer>> res, List<Integer> curRes, int index, int maxIndex, int[] ns) {

        if (index > maxIndex) return;
        res.add(new ArrayList<>(curRes));

        for (int i = index; i < maxIndex; i++) {
            curRes.add(ns[i]);
            helper(res, curRes, i+1, maxIndex, ns);
            curRes.remove(curRes.size() - 1);
        }

    }

}
