import java.util.Stack;

public class Calculate1 {


    public int calculate(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') sb.append(s.charAt(i));
        }
        s = sb.toString();
//        if (s.charAt(0) != '-') s = "+" + s;
        sb = new StringBuilder();
        char sign = '+';
        int currentNumber = 0;
//        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = '-';
            s = s.substring(1);
        }
        Stack<Integer> st = new Stack<>();
        sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                currentNumber = currentNumber * 10 + (sb.charAt(i) - '0');
            }
            if (!Character.isDigit(sb.charAt(i)) || i == sb.length() - 1) {
                if (sign == '-') {
                    st.push(-currentNumber);
                } else if (sign == '+') {
                    st.push(currentNumber);
                } else if (sign == '*') {
                    st.push(st.pop() * currentNumber);
                } else if (sign == '/') {
                    st.push(st.pop() / currentNumber);
                }
                sign = sb.charAt(i);
                currentNumber = 0;
            }
        }
        int result = 0;
        while (!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }

}
