import java.util.HashMap;

public class CountConsistentStrings {

    public int countConsistentStrings(String al, String[] ws) {
        HashMap<Character, Boolean> h = new HashMap<>();
        for (char c : al.toCharArray()) h.put(c, true);
        int cnt = ws.length;
        for (String w : ws) {
            for (char c : w.toCharArray())
                if (!h.containsKey(c)) {
                    cnt--;
                    break;
                }
        }
        return cnt;
    }

}
