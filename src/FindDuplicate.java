import java.util.HashMap;

public class FindDuplicate {

    public int findDuplicate(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int n : ns) {
            h.put(n, h.getOrDefault(n, 0) + 1);
        }
        int num = 0;
        for (int n : ns) {
            if (h.get(n) % 2 == 0) return n;
            if (h.get(n) % 2 == 1 && h.get(n) > 2){
                num = n;
            }
        }
        return num;
    }

}
