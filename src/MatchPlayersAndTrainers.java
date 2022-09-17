import java.util.Arrays;

public class MatchPlayersAndTrainers {

    public int matchPlayersAndTrainers(int[] ps, int[] ts) {
        Arrays.sort(ps);
        Arrays.sort(ts);
//        boolean[] p = new boolean[ps.length];
        int nn = ps.length - 1;
        int cnt = 0;
        int i = ts.length - 1;
        while (i >= 0) {
            if (nn < 0) break;
            if (ts[i] >= ps[nn]) {
                cnt++;
//                System.out.println("t " + ts[i] + " : " + "p " + ps[nn]);
                nn--;
            } else if (ts[i] < ps[nn]) {
                nn--;
                i++;
            }
            i--;
        }
        return cnt;
    }
}
