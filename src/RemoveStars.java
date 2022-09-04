import java.util.Stack;

public class RemoveStars {

    public String removeStars(String s) {
        Stack<Character> ss = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') ss.pop();
            else {
                ss.push(c);
            }
        }
        StringBuilder sss = new StringBuilder();
        while (!ss.empty()) {
            sss.append(ss.pop());
        }
        return sss.reverse().toString();
    }

}
