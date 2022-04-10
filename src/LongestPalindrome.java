import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        int max = 0;
        for (char c : s.toCharArray()) {
            int r = h.getOrDefault(c, 0);
            if (r % 2 == 0)
                cnt += r;
            else {
                cnt += r - 1;
                q.add(1);
            }

            if (r != 0) {
                h.remove(c);
            }
        }
        while (!q.isEmpty()) {
            int m = q.remove();
            if (m > max) max = m;
        }
        return cnt + max;
    }

}
