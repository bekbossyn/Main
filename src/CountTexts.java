public class CountTexts {

    int MOD = (int) Math.pow(10, 9) + 7;

    public int countTexts(String pressedKeys) {
        int len = pressedKeys.length();
        int[] b = new int[len + 1];
        b[0] = 1;
        for (int i = 1; i <= len; i++) {
            b[i] = (b[i] + b[i - 1]) % MOD;
            char c = pressedKeys.charAt(i - 1);
            if (i - 2 >= 0 && pressedKeys.charAt(i - 2) == c) {
                b[i] = (b[i] + b[i - 2]) % MOD;
                if (i - 3 >= 0 && pressedKeys.charAt(i - 3) == c) {
                    b[i] = (b[i] + b[i - 3]) % MOD;
                    if (i - 4 >= 0 && pressedKeys.charAt(i - 4) == c && (c == '7' || c == '9')) {
                        b[i] = (b[i] + b[i - 4]) % MOD;
                    }
                }
            }
        }
        return b[len];
    }
}