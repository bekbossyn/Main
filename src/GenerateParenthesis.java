import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(0, 0, n, new StringBuilder(), result);
        return result;
    }

    private void helper(int pos, int open, int len, StringBuilder current, List<String> result) {
        if (pos >= len * 2 || open < 0) {
            if (open == 0) result.add(current.toString());
        } else {
            StringBuilder c = new StringBuilder(current);
            if (open < len) {
                c.append('(');
                helper(pos + 1, open + 1, len, c, result);
            }
            current.append(')');
            helper(pos + 1, open - 1, len, current, result);
        }
    }


}
