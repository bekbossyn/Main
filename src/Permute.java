import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {

    public List<List<Integer>> permute(int[] ns) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> left = new ArrayList<>();
        for (int n : ns) left.add(n);

        helper(result, new ArrayList<>(), left, ns, 0);

        return result;
    }

    void helper(List<List<Integer>> result, List<Integer> listCopy, List<Integer> left, int[] ns, int pos) {
        if (pos >= ns.length) {
            result.add(new ArrayList<>(listCopy));
            return;
        }

        for (int i = 0; i < left.size(); i++) {
            int num = left.get(i);

            //  version 1   Faster
            List<Integer> list = new ArrayList<>(left);
            list.remove(i);
            //

            //  version 2   Slower
//            List<Integer> list = new ArrayList<>();
//            for (int j = 0; j < left.size(); j++)
//                if (j != i) list.add(left.get(j));
            //

            listCopy.add(num);
            helper(result, listCopy, list, ns, pos + 1);
            listCopy.remove(listCopy.size() - 1);
        }

    }

}

