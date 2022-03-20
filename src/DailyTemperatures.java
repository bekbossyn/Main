import java.util.Stack;

public class DailyTemperatures {

    public static class Number {
        int value;
        int index;

        Number(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }


    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Number> st = new Stack<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek().value <= temperatures[i]) {
                st.pop();
            }
            if (!st.empty()) {
                res[i] = st.peek().index - i;
            }
            st.push(new Number(temperatures[i], i));
        }
        return res;
    }

}
