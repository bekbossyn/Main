/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      00:56:44
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubsetsWithDup {

    static HashSet<List<Integer>> h = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] ns) {
        Arrays.sort(ns);
        h = new HashSet<>();
//        List<List<Integer>> result = new ArrayList<>();
        helper(new ArrayList<>(), 0, ns.length, ns);

        return new ArrayList<>(h);

    }

    void helper(List<Integer> curRes, int index, int maxIndex, int[] ns) {

        if (index > maxIndex) return;
        h.add(new ArrayList<>(curRes));

        for (int i = index; i < maxIndex; i++) {
            curRes.add(ns[i]);
            helper(curRes, i + 1, maxIndex, ns);
            curRes.remove(curRes.size() - 1);
        }

    }

}
