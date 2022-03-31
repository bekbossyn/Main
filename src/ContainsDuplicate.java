import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] ns) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        for (int n : ns) {
            if (h.containsKey(n)) return true;
            h.put(n, true);
        }
        return false;
    }

}
