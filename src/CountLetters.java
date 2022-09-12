import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CountLetters {

    public int countLetters(String s) {
        Stack<Integer> q = new Stack<>();
        Stack<Character> c = new Stack<>();
        for (char cc : s.toCharArray()) {
            if (q.isEmpty()) {
                c.add(cc);
                q.add(1);
            } else {
                if (c.peek() == cc) {
                    int t = q.remove(q.size() - 1);
                    q.add(t + 1);
                } else {
                    q.add(1);
                    c.add(cc);
                }
            }
        }
        int sum = 0;
        System.out.println(q);
        while (!q.isEmpty()) {
            int t = q.remove(q.size() - 1);
            sum += t * (t + 1) / 2;
        }
        return sum;
    }

}
