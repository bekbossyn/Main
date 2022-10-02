public class TrailingZeroes {

    public int trailingZeroes(int n) {
        int[] nn = new int[2];
        for (int i = 2; i <= n; i++) {
            int q = i;
            while (q % 2 == 0 || q % 5 == 0) {
                if (q % 2 == 0) {
                    nn[0]++;
                    q /= 2;
                }
                if (q % 5 == 0) {
                    nn[1]++;
                    q /= 5;
                }
            }
        }
        return Math.min(nn[0], nn[1]);
    }

}
