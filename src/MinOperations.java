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

    public int minOperations(int[] ns) {

        int answer = 100;
        int ones = 0;
        int len = ns.length;
        for (int n : ns) if (n == 1) ones++;
        if (ones > 0) return len - ones;
        for (int i = 0; i < len; i++) {
            int num = ns[i];
            for (int j = i + 1; j < len; j++) {
                num = gcd(num, ns[j]);
                if (num == 1) {
                    answer = Math.min(answer, j - i);
                    break;
                }
            }
            if (num != 1) break;
        }
        if (answer == 100) return -1;
        return answer + len - 1;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}
