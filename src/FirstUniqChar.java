import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqChar {

    public int firstUniqChar1(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (h.get(c) == 1) return cnt;
            cnt++;
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray())
            h.put(c, h.getOrDefault(c, 0) + 1);
        int i = 0;
        for (char c : s.toCharArray()) {
            if (h.get(c) == 1) return i;
            i++;
        }
        return -1;
    }

}
