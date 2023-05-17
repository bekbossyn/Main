/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/17
[HH:MM:SS]      16:25:20
*/


import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class MinimumVisitedCells {

    record Pair(int x, int y) {
    }

    public int minimumVisitedCells(int[][] g) {
        int n = g.length, m = g[0].length;
        TreeSet<Integer> rows[] = new TreeSet[n];
        TreeSet<Integer> cols[] = new TreeSet[m];
        for (int i = 0; i < n; i++) {
            rows[i] = new TreeSet<>();
            for (int j = 0; j < m; j++) rows[i].add(j);
        }
        for (int j = 0; j < m; j++) {
            cols[j] = new TreeSet<>();
            for (int i = 0; i < n; i++) cols[j].add(i);
        }

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(0, 0));
        int distance = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                Pair cur = q.poll();
                int x = cur.x, y = cur.y;
                if (x == n - 1 && y == m - 1) return distance + 1;
//                rows[x].subSet(y + 1, Math.min(y + g[x][y] + 1, m)).forEach(k -> q.add(new Pair(x, k)));
//                cols[y].subSet(x + 1, Math.max(x + g[x][y] + 1, n)).forEach(k -> q.add(new Pair(k, y)));
                var rSet = rows[x].subSet(y + 1, Math.min(m, y + g[x][y] + 1));
                var cSet = cols[y].subSet(x + 1, Math.min(n, x + g[x][y] + 1));
                rSet.forEach(k -> q.add(new Pair(x, k)));
                cSet.forEach(k -> q.add(new Pair(k, y)));
                rSet.clear();
                cSet.clear();
                size--;
            }
            distance++;
        }

        return -1;
    }

}
