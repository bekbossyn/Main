import java.util.Arrays;
import java.util.PriorityQueue;

public class MinMeetingRooms {

    public int minMeetingRooms(int[][] ints) {
        Arrays.sort(ints, (a, b) -> Double.compare(a[0], b[0]));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int[] i : ints) {
            if (!q.isEmpty() && q.peek() < i[0]) q.remove();
            q.add(i[1]);
        }
        return q.size();
    }

}
