import java.util.HashMap;

public class MostFrequentEven {

    public int mostFrequentEven(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : ns) {
            if (i % 2 == 0) {
                h.put(i, h.getOrDefault(i, 0) + 1);
            }
        }
        int max = 0;
        int num = -1;
        for (int i = 0; i <= 100000; i += 2) {
            if (h.containsKey(i)) {
                if (h.get(i) > max) {
                    num = i;
                    max = h.get(i);
                }
            }
        }
        return num;
    }

}
