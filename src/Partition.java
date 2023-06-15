import java.util.ArrayList;
import java.util.List;

public class Partition {

    List<List<String>> result;

    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        rec(s, 0, new ArrayList<String>(), result);
        return result;
    }

    private void rec(String s, int index, ArrayList<String> current, List<List<String>> result) {
        if (index >= s.length()) result.add(new ArrayList<>(current));
        for (int i = index + 1; i <= s.length(); i++) {
            String ss = s.substring(index, i);
            if (palindrome(ss)) {
                current.add(ss);
                rec(s, i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean palindrome(String ss) {
        int i = 0, j = ss.length() - 1;
        while (i < j) {
            if (ss.charAt(i) != ss.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
