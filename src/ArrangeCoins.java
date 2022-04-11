public class ArrangeCoins {

    public int arrangeCoins(int n) {
        int res = (int) Math.sqrt((long) 2 * n);
        while (res * (res + 1) / 2 <= n) res++;
        return res - 1;
    }

}
