import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixIII {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<int[]> l = new ArrayList<>();
        int cnt = 1;
        int ii = 1;
        l.add(new int[]{rStart, cStart});
        while (cnt < rows * cols) {
//            cnt++;
//            if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
//                l.add(new int[]{rStart, cStart});
//            }
            for (int i = 0; i < ii; i++) {
                cStart++;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    cnt++;
                    l.add(new int[]{rStart, cStart});
                }
            }
            for (int i = 0; i < ii; i++) {
                rStart++;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    cnt++;
                    l.add(new int[]{rStart, cStart});
                }
            }
            ii++;
            for (int i = 0; i < ii; i++) {
                cStart--;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    cnt++;
                    l.add(new int[]{rStart, cStart});
                }
            }
            for (int i = 0; i < ii; i++) {
                rStart--;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    cnt++;
                    l.add(new int[]{rStart, cStart});
                }
            }
            ii++;
        }
        return l.toArray(new int[l.size()][]);
    }

}
