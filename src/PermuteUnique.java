/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      01:55:23
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermuteUnique {

    //    private static HashSet<List<Integer>> h = new HashSet<>();
    private static HashSet<List<Integer>> result;

    public List<List<Integer>> permuteUnique(int[] ns) {
        result = new HashSet<>();
        Arrays.sort(ns);
        backtrack(0, ns);
        return new ArrayList<>(result);
    }

    void backtrack(int index, int[] ns) {
        if (index == ns.length) {
            List<Integer> list = new ArrayList<>(ns.length);
            for (int n : ns) list.add(n);
            result.add(list);
        } else {
            for (int i = index; i < ns.length; i++) {
                if (i > index && ns[i] == ns[index]) continue;
                swap(i, index, ns);
                backtrack(index + 1, ns);
                swap(i, index, ns);
            }
        }
    }

    void swap(int i, int j, int[] ns) {
        int temp = ns[i];
        ns[i] = ns[j];
        ns[j] = temp;
    }

}
