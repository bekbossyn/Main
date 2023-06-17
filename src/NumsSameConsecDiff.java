import java.util.ArrayList;
import java.util.List;

public class NumsSameConsecDiff {

    List<Integer> list;

    public int[] numsSameConsecDiff(int n, int k) {
        list = new ArrayList<>();
        helper(0, 0, n, k, list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }

    private void helper(int index, int num, int n, int k, List<Integer> list) {
        if (index == n) {
            list.add(num);
            return;
        }
        if (index == 0) {
            for (int i = 1; i < 10; i++) {
                helper(index + 1, i, n, k, list);
            }
        } else {
            if (num % 10 + k < 10)
                helper(index + 1, num * 10 + (num % 10 + k), n, k, list);
            if (num % 10 - k >= 0 && k != 0)
                helper(index + 1, num * 10 + (num % 10 - k), n, k, list);
        }
    }

}
