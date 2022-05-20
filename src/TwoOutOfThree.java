import java.util.*;

public class TwoOutOfThree {

    public List<Integer> twoOutOfThree(int[] ns1, int[] ns2, int[] ns3) {
        List<Integer> l = new ArrayList<>();
        byte[][] cnt = new byte[3][101];
        for (int n : ns1) cnt[0][n] = 1;
        for (int n : ns2) cnt[1][n] = 1;
        for (int n : ns3) cnt[2][n] = 1;
        for (int i = 1; i < 101; i++) {
            if (cnt[0][i] + cnt[1][i] + cnt[2][i] > 1) l.add(i);
        }
        return l;
    }

}
