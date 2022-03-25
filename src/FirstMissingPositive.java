import java.util.HashMap;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] ns) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        for (int i : ns) h.put(i, true);
        for (int i = 1; i < 5 * 100002; i++) {
            if (!h.containsKey(i)) {
                return i;
            }
        }
        return 1;
    }

}
