import java.util.Stack;

public class BackspaceCompare {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!st.empty()) st.pop();
            } else
                st.push(c);
        }
        var ss = new StringBuilder();
        while (!st.empty()) ss.append(st.pop());
        s = ss.toString();

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!st.empty()) st.pop();
            } else
                st.push(c);
        }

        ss = new StringBuilder("");
        while (!st.empty()) ss.append(st.pop());
        t = ss.toString();
        if (s.compareTo(t) == 0) return true;
        return false;
    }
}

