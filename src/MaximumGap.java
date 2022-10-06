import java.util.PriorityQueue;

public class MaximumGap {

    public int maximumGap(int[] ns) {
        if (ns.length <= 1) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : ns) pq.add(n);
        int prev = pq.remove();
        int max = -1;
        while (!pq.isEmpty()) {
            int last = pq.remove();
            max = Math.max(max, last - prev);
            prev = last;
        }
        return max;
    }

}
