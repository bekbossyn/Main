import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {

    public int[][] merge(int[][] ints) {
        Arrays.sort(ints, (a, b) -> Double.compare(a[0], b[0]));
        List<int[]> l = new ArrayList<>();
        int len = ints.length;
        int first = 0;
        int lastV = ints[first][1];
        for (int i = 1; i < len; i++) {
            if (lastV >= ints[i][0]) {
            } else {
                l.add(new int[]{ints[first][0], lastV});
                first = i;
            }
            lastV = Math.max(lastV, ints[i][1]);
        }
        if (l.size() > 0) {
            if (lastV != l.get(l.size() - 1)[1]) l.add(new int[]{ints[first][0], lastV});
        } else {
            l.add(new int[]{ints[first][0], lastV});
        }
        return l.toArray(new int[0][]);
    }

}
