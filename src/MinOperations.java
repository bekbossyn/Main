import java.util.Objects;
import java.util.Stack;

public class MinOperations {

    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for (String l : logs) {
            if (Objects.equals(l, "../")) {
                if (!st.empty()) st.pop();
            } else if (Objects.equals(l, "./")) {

            } else {
                st.push(l);
            }
        }
        int len = 0;
        while (!st.empty()) {
            len++;
            st.pop();
        }
        return len;
    }

}
