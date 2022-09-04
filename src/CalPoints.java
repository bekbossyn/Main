import java.util.Objects;
import java.util.Stack;

public class CalPoints {

    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for (String o : ops) {
            if (Objects.equals(o, "C")) {
                st.pop();
            } else if (Objects.equals(o, "+")) {
                int p = st.peek();
                st.pop();
                int pp = st.peek();
                st.push(p);

                st.push(p + pp);
            } else if (Objects.equals(o, "D")) {
                st.push(st.peek() * 2);
            } else {
                st.push(Integer.valueOf(o));
            }
        }
        int sum = 0;
        while (!st.empty()) {
            sum += st.pop();
        }
        return sum;
    }

}
