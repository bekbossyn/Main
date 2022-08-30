import java.util.HashSet;

public class NumDistinctIslands {

    public int numDistinctIslands(int[][] g) {
        HashSet<String> h = new HashSet<>();
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++) {
                if (g[i][j] == 1) {
                    StringBuilder s = new StringBuilder();
                    helper(g, i, j, i, j, s);
                    h.add(s.toString());
                }
            }
        return h.size();
    }

    public void helper(int[][] g, int i, int j, int oi, int oj, StringBuilder s) {
        g[i][j] = 0;
//        s.append(oi-i).append(",").append(oj-j).append("$");
        s.append(i - oi).append(",").append(j - oj).append("$");
        if (i - 1 >= 0 && g[i - 1][j] == 1) helper(g, i - 1, j, oi, oj, s);
        if (i + 1 < g.length && g[i + 1][j] == 1) helper(g, i + 1, j, oi, oj, s);
        if (j - 1 >= 0 && g[i][j - 1] == 1) helper(g, i, j - 1, oi, oj, s);
        if (j + 1 < g[0].length && g[i][j + 1] == 1) helper(g, i, j + 1, oi, oj, s);
    }
}
