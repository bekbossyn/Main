import java.util.PriorityQueue;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] n1, int[] n2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : n1) pq.add(n);
        for (int n : n2) pq.add(n);
        int size = n1.length + n2.length;
        int mid = size / 2;
        if (size % 2 == 1) {
            for (int i = 0; i < mid; i++) pq.remove();
            return pq.remove() * 1.0;
        } else {
            for (int i = 0; i < mid - 1; i++) pq.remove();
            return (pq.remove() + pq.remove()) / 2.0;
        }
    }

}
