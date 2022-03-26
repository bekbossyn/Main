import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MoveZeroes {

    public void moveZeroes(int[] ns) {
        int cnt = 0;
        for (int n : ns) {
            if (n != 0) ns[cnt++] = n;
        }
        for (int i = cnt; i < ns.length; i++) ns[i] = 0;
    }

    /*
    public void moveZeroes(int[] ns) {
        Queue<Integer> numbers = new LinkedList<>();
        int cnt = 0;
        for (int n : ns) {
            if (n != 0) numbers.add(n);
            cnt++;
        }
        cnt = 0;
        while (numbers.peek() != null) ns[cnt++] = numbers.remove();
        for (int i = cnt; i < ns.length; i++) ns[i] = 0;
    }
     */

}
