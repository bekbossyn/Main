import java.util.*;

public class RemoveAnagrams {

    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>(Arrays.asList(words));

        while (true) {
            boolean found = false;
            if (result.size() <= 1) break;
            for (int i = 1; i < result.size(); i++) {
                if (anagrams(result.get(i - 1), result.get(i))) {
                    result.remove(i);
                    found = true;
                    break;
                }
            }
            if (!found) break;
        }
        return result;
    }

    boolean anagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        return Arrays.equals(aa, bb);
    }

}
