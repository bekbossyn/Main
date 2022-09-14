import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinGroups {

    public int minGroups(int[][] ints) {
        Arrays.sort(ints, (a, b) -> Double.compare(a[0], b[0]));
        int len = ints.length;
        Queue<Integer> q = new PriorityQueue<>();
        for (int[] i : ints) {
            if (!q.isEmpty() && q.peek() < i[0]) q.remove();
//            System.out.println(q);
            q.add(i[1]);
            System.out.println(q);
        }
        return q.size();
    }

}
