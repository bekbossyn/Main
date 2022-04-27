import java.util.Stack;

public class RemoveDuplicates {

    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.empty()) {
                if (st.peek() == ch) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            } else {
                st.push(ch);
            }
        }
        StringBuilder ss = new StringBuilder();
        while (!st.isEmpty()) {
            ss.append(st.pop());
        }
        return ss.reverse().toString();
    }

}
