import java.util.HashSet;
import java.util.PriorityQueue;

class SmallestInfiniteSet {

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    HashSet<Integer> h = new HashSet<>();

    public SmallestInfiniteSet() {
        pq.clear();
        h.clear();
        for (int i = 1; i < 1001; i++) {
            pq.add(i);
            h.add(i);
        }

    }

    public int popSmallest() {
        int res = pq.remove();
        h.remove(res);
        return res;
    }

    public void addBack(int num) {
        if (!h.contains(num))
            pq.add(num);
        h.add(num);
    }

}
