import java.util.HashMap;

public class PartitionString {

    public int partitionString(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int cnt = 1;
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
            if (h.get(c) > 1) {
                HashMap<Character, Integer> hh = new HashMap<>();
                h = hh;
                h.put(c,1);
                cnt++;
            }

        }
        return cnt;
    }

}
