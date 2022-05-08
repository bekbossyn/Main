import java.util.HashMap;

public class LargestUniqueNumber {

    public int largestUniqueNumber(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : ns) h.put(n, h.getOrDefault(n, 0) + 1);
        int max = -1;
        for (int n : ns) if (max < n && h.get(n) == 1) max = n;
        return max;
    }

}
