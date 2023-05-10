/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      01:55:23
*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuteUnique {

    static HashSet<List<Integer>> h = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] ns) {
        h = new HashSet<>();
        List<Integer> left = new ArrayList<>();
        for (int n : ns) left.add(n);
        helper(new ArrayList<>(), left, 0, ns);
        return new ArrayList<>(h);
    }

    void helper(List<Integer> listCopy, List<Integer> left, int pos, int[] ns) {
        if (pos >= ns.length) {
            h.add(new ArrayList<>(listCopy));
            return;
        }
        for (int i = 0; i < left.size(); i++) {
            int num = left.get(i);
            List<Integer> list = new ArrayList<>(left);
            list.remove(i);
            listCopy.add(num);
            helper(listCopy, list, pos + 1, ns);
            listCopy.remove(listCopy.size() - 1);
        }

    }

}
