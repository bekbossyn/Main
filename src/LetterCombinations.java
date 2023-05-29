import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    List<String> answer = new ArrayList<>();
    String[] digits = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String ds) {
        answer.clear();
        if (ds.length() == 0) return answer;
        helper(new StringBuilder(), ds, 0, answer);
        return answer;
    }

    void helper(StringBuilder ca, String ds, int pos, List<String> answer) {
        if (pos == ds.length()) {
            answer.add(ca.toString());
            return;
        }
        for (int i = 0; i < digits[ds.charAt(pos) - '0'].length(); i++) {
            StringBuilder cc = new StringBuilder(ca);
            cc.append(digits[ds.charAt(pos) - '0'].charAt(i));
            helper(cc, ds, pos + 1, answer);
        }
    }

}
