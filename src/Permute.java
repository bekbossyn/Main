import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {

    private List<List<Integer>> result;

    public List<List<Integer>> permute(int[] ns) {
        result = new ArrayList<>();
        backtrack(0, ns);
        return result;
    }

    void backtrack(int index, int[] ns) {
        if (index == ns.length) {
            List<Integer> list = new ArrayList<Integer>(ns.length);
            for (int n : ns) list.add(n);
            result.add(list);
        } else {
            for (int i = index; i < ns.length; i++) {
                swap(i, index, ns);
                backtrack(index + 1, ns);
                swap(i, index, ns);
            }
        }
    }

    private void swap(int i, int j, int[] ns) {
        int temp = ns[i];
        ns[i] = ns[j];
        ns[j] = temp;
    }

}

