public class ReorderedPowerOf2 {

    public boolean reorderedPowerOf2(int n) {
        int len = String.valueOf(n).length();
        int[] b = new int[11];
        b[10] = len;
        for (char c : String.valueOf(n).toCharArray()) {
            b[c - '0']++;
        }
        if (n == 1) return true;
        if (n < 2) return false;
        long num = 2;
        int[][] a = new int[35][11];
        int cnt = 0;
        while (num < Math.pow(2, 34)) {
            long nn = num;
            num *= 2;
            String ss = String.valueOf(nn);
            for (char c : ss.toCharArray()) {
                int q = c - '0';
                a[cnt][q]++;
            }
            a[cnt][10] = ss.length();
            if (a[cnt][10] == len) {
                boolean mismatch = false;
                for (int i = 0; i < 11; i++)
                    if (b[i] != a[cnt][i]) {
                        mismatch = true;
                        break;
                    }
                if (!mismatch) return true;

            }
            cnt++;
        }

        return false;
    }

}
