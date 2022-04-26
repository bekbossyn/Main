public class MinMoves {

    public int minMoves(int t, int m) {
        int cnt = 0;
        while (t != 1) {
            while (m > 0) {
                if (t % 2 == 0) {
                    m--;
                    t /= 2;
                } else {
                    t -= 1;
                }
                cnt++;
                if (t == 1) break;
            }
            if (t == 1) break;
            cnt += t - 1;
            break;
        }
        return cnt;
    }

}
