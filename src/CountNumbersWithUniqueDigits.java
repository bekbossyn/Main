public class CountNumbersWithUniqueDigits {

    static int[] res;

    public int countNumbersWithUniqueDigits(int n) {
        if (res == null) init();
        return res[n];
    }

    private static void init() {
        res = new int[9];
        res[0] = 1;
        res[1] = 10;
        for (int i = 2; i < res.length; i++) {
            int cnt = 9;
            for (int j = 9; j > 9 - i + 1; j--) cnt *= j;
            res[i] = res[i - 1] + cnt;
        }
    }

}
