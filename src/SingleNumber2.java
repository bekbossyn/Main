import java.util.HashMap;

public class SingleNumber2 {

    public int singleNumber(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : ns) {
            h.put(n, h.getOrDefault(n, 0) + 1);
        }
        for (int n : ns)
            if (h.get(n) == 1)
                return n;
        return 0;
    }

}
