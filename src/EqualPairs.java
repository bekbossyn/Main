public class EqualPairs {

    public int equalPairs(int[][] g) {
        int cnt = 0;
        for (int[] ints : g) {
            for (int j = 0; j < g.length; j++)
                if (ints[0] == g[0][j]) {
                    boolean equal = true;
                    for (int k = 1; k < g.length; k++) {
                        if (ints[k] != g[k][j]) {
                            equal = false;
                            break;
                        }
                    }
                    if (equal) cnt++;
                }
        }
        return cnt;
    }

}
