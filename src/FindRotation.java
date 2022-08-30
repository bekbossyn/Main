public class FindRotation {

    boolean same(int[][] a, int[][] b) {
        int l = a.length;
        for (int i = 0; i < l; i++)
            for (int j = 0; j < l; j++)
                if (a[i][j] != b[i][j]) return false;
        return true;
    }

    public boolean findRotation(int[][] m, int[][] t) {
        int l = m.length;
        for (int i = 0; i < 4; i++) {
            if (same(m, t)) return true;
            m = next(m);
//            for (int[] ints : m) System.out.println(Arrays.toString(ints));
//            System.out.println();
        }
        return false;
    }

    int[][] next(int[][] a) {
        int l = a.length;
        int[][] b = new int[l][l];

        //reverse by diagonal
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                b[i][j] = a[j][i];
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l / 2; j++) {
                int t = b[i][j];
                b[i][j] = b[i][l - j - 1];
                b[i][l - j - 1] = t;
            }
        }
        return b;
    }

}
