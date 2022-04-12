import java.util.ArrayList;
import java.util.List;

public class ShiftGrid {

    public List<List<Integer>> shiftGrid(int[][] g, int k) {
        int[] gs = new int[g.length * g[0].length];
        k = g.length * g[0].length - k;
        while ( k <0) k+= g.length*g[0].length;
        k = k % (g.length * g[0].length);
        int cnt = 0;
        int cntG = 0;
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[i].length; j++) {
                cnt++;
                if (cnt > k) {
                    gs[cntG++] = g[i][j];
                }
            }
        for (int i = 0; i < g.length; i++) {
            if (k <= 0) break;
            for (int j = 0; j < g[i].length; j++) {
                if (k <= 0) break;
                k--;
                gs[cntG++] = g[i][j];
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        cnt = 0;
        for (int i = 0; i < g.length; i++) {
            List<Integer> ll = new ArrayList<>();
            for (int j = 0; j < g[i].length; j++) {
                ll.add(gs[cnt++]);
            }
            l.add(ll);
        }
        return l;
    }
}
