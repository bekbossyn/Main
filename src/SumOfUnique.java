import java.util.Arrays;
import java.util.HashMap;

public class SumOfUnique {

    public int sumOfUnique(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        for (int n : ns) h.put(n, h.getOrDefault(n, 0) + 1);
        for (int i = 0; i < ns.length; i++)
            if (h.get(ns[i]) == 1) sum += ns[i];
        return sum;
    }

}
