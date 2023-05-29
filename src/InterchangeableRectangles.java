import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class InterchangeableRectangles {

    public long interchangeableRectangles(int[][] rs) {
        HashMap<Double, Integer> h = new HashMap<>();
        for (int[] r : rs) {
            int x = r[0], y = r[1];
            h.put(r[0] * 1.0 / r[1], h.getOrDefault(r[0] * 1.0 / r[1], 0) + 1);
        }
        long res = 0;
        for (Map.Entry<Double, Integer> pair : h.entrySet()) {
            int r = pair.getValue();
            res += (long) r * (r - 1) / 2;

        }
        return res;
    }

}
