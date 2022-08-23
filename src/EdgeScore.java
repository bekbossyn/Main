import java.util.Arrays;

public class EdgeScore {

    public int edgeScore(int[] e) {
        long[] sum = new long[e.length];
        for (int i = 0; i < e.length; i++) {
            sum[e[i]] += i;
        }
        long max = -1;
        int ind = 0;
        for (int i = 0; i < sum.length; i++)
            if (max < sum[i]) {
                ind = i;
                max = (long)sum[i];
            }
        return ind;
    }

}
