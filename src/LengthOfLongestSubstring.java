import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0, n = s.length();
        HashSet<Character> hashSet = new HashSet<>();
        while (i < n && j < n) {
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(max, j - i);
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

}
