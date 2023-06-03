import java.util.Arrays;
import java.util.Stack;

public class Calculate {

    Stack<Integer> st;

    public int calculate(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') sb.append(s.charAt(i));
        }
        s = sb.toString();
        if (s.charAt(0) != '-') s = "+" + s;
        sb = new StringBuilder();
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        }
        st = new Stack<>();
        st.push(1);
        st.push(sign);
        sb = new StringBuilder(s);
        return helper(sb, sign);
    }

    public int helper(StringBuilder s, int sign) {
        if (s.length() == 0) return 0;
        if (s.charAt(0) == '(') {
            st.add(sign);
            s.deleteCharAt(0);
            return st.peek() * helper(s, 1);
        } else if (s.charAt(0) == '+') {
            s.deleteCharAt(0);
            return helper(s, 1);
        } else if (s.charAt(0) == '-') {
            s.deleteCharAt(0);
            return helper(s, -1);
        } else if (s.charAt(0) == ')') {
            s.deleteCharAt(0);
            return st.pop() * helper(s, 1);
        } else {
            int i = 0;
            int number = 0;
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                number = number * 10 + (s.charAt(i) - '0');
                i++;
            }
            s.delete(0, i);
            return sign * number + helper(s, 1);
        }
    }

}
