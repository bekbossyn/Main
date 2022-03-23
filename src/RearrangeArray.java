import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RearrangeArray {

    public int[] rearrangeArray(int[] ns) {
        int len = ns.length;
        Queue<Integer> posQ = new LinkedList<>();
        Queue<Integer> negQ = new LinkedList<>();
        for (int n : ns)
            if (n > 0)
                posQ.add(n);
            else if (n < 0)
                negQ.add(n);
        for (int i = 0; i < len; i += 2) ns[i] = posQ.remove();
        for (int i = 1; i < len; i += 2) ns[i] = negQ.remove();
        return ns;
    }

}
