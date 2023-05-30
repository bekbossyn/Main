import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {

    public List<List<Integer>> minimumAbsDifference(int[] a) {
        Arrays.sort(a);
        int min = 3000000;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++)
            min = Math.min(min, a[i + 1] - a[i]);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] == min) {
                List<Integer> l = new ArrayList<>();
                l.add(a[i]);
                l.add(a[i + 1]);
                result.add(new ArrayList<>(l));
            }
        }
        return result;
    }

}
