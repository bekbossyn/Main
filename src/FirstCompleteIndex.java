import java.util.Arrays;
import java.util.HashMap;

public class FirstCompleteIndex {

    public int firstCompleteIndex(int[] a, int[][] m) {
        int lenX = m.length;
        int lenY = m[0].length;
        int len = a.length;

        HashMap<Integer, Integer> rows = new HashMap<>();
        HashMap<Integer, Integer> cols = new HashMap<>();
        int[] rs = new int[len];
        int[] cs = new int[len];
        for (int i = 0; i < lenX; i++)
            for (int j = 0; j < lenY; j++) {
                int val = m[i][j];
                rows.put(val, i);
                cols.put(val, j);
            }

        for (int i = 0; i < len; i++) {
            int row = rows.get(a[i]);
            int col = cols.get(a[i]);
            rs[row]++;
            cs[col]++;
            if (rs[row] >= lenY) return i;
            if (cs[col] >= lenX) return i;

//            System.out.println(Arrays.toString(rs));
//            System.out.println(Arrays.toString(cs));
        }

        return 0;
    }

}
