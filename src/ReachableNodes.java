import java.util.*;

public class ReachableNodes {

    public int reachableNodes(int n, int[][] edges, int[] r) {
        List<List<Integer>> adj = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for (int i : r) s.add(i);
//        for (int i = 0; i < n; i++) hr.put(i, true);

        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] i : edges) {
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        used[0] = true;
        while (!q.isEmpty()) {
            int cur = q.remove();

            for (int i : adj.get(cur))
                if (!used[i] && !s.contains(i)) {
                    used[i] = true;
                    q.add(i);
                }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) if (used[i]) cnt++;
        return cnt;
    }

}
