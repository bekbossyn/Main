public class IntegerBreak {

    public int integerBreak(int n) {
        int[] b = new int[n + 1];
        for (int i = 1; i < n; i++) b[i] = i;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                b[i] = Math.max(b[i], b[j] * (i - j));
            }
        }
        return b[n];
    }

}
