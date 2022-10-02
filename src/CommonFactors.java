public class CommonFactors {

    public int commonFactors(int a, int b) {
        int i = Math.min(a, b);
        int cnt = 0;
        for (int k = 1; k <= i; k++) {
            if (a % k == 0 && b % k == 0) cnt++;
        }
        return cnt;
    }

}
