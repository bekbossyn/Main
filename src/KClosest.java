import java.util.Arrays;
import java.util.Comparator;

public class KClosest {

    public int[][] kClosest(int[][] ps, int k) {
//        Arrays.sort(ps, (p1, p2) -> ((p1[1] * p1[1] + p1[0] * p1[0]) - (p2[1] * p2[1] + p2[0] * p2[0])));
        Arrays.sort(ps, Comparator.comparingInt(p -> (p[1] * p[1] + p[0] * p[0])));
        return Arrays.copyOfRange(ps, 0, k);
    }

}
