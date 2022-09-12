import java.util.*;

public class CountPairs {

    public int countPairs(int[] ns, int k) {
        int cnt = 0;
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = i + 1; j < ns.length; j++) {
                if (ns[i] == ns[j]) {
                    if (i * j % k == 0) cnt++;
                }
            }
        }
        return cnt;
    }

    public long countPairs(int n, int[][] edges) {
        long sum = ((long) n * (n - 1)) / 2;

        Queue[] g = new Queue[n];

        for (int i = 0; i < g.length; i++) {
            g[i] = new LinkedList<Queue<Integer>>();
        }
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        int[] v = new int[n];
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (v[i] == 0) {
                v[i] = ++cnt;
                cnt++;
                long ct = 0;
                q.add(i);
                while (!q.isEmpty()) {
                    ct++;
                    int cur = q.remove();
                    while (!g[cur].isEmpty()) {
                        int j = (int) g[cur].remove();
                        if (v[j] == 0) {
                            v[j] = cnt;
                            q.add(j);
                        }

                    }
                }
                sum -= (ct * (ct - 1)) / 2;
            }
        return sum;
    }


}
