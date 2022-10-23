import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : arr) h.put(i, h.getOrDefault(i, 0) + 1);

        int i = 0;

        List keys = new ArrayList(h.keySet());
        int len = keys.size();
        int[] ar = new int[len];
        for (int j = 0; j < len; j++) {
            ar[i++] = (h.get(keys.get(j)));
        }
        Arrays.sort(ar);

        for (int k = 0; k < i - 1; k++)
            if (ar[k] == ar[k + 1]) return false;
        return true;
    }

}
