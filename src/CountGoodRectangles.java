public class CountGoodRectangles {

    public int countGoodRectangles(int[][] rs) {
        int l = rs.length;
        int[] ms = new int[l];
        int max = 0;
        int i = 0;
        for (int[] r : rs) {
            ms[i++] = Math.min(r[0], r[1]);
            max = Math.max(ms[i - 1], max);
        }
        int cnt = 0;
        for (int m : ms) {
            if (max == m) cnt++;
        }
        return cnt;
    }

}
