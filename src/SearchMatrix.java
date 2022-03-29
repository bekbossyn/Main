import java.util.Arrays;

public class SearchMatrix {
    // binary method
    public boolean searchMatrix(int[][] ms, int t) {
        int n = ms.length;
        int m = ms[0].length;

        int l = 0, r = n * m - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            int num = ms[mid / m][mid % m];
            if (t > num) {
                l = mid + 1;
            } else if (t < num) {
                r = mid - 1;
            } else {
                l = mid;
                break;
            }
        }
        System.out.println(Arrays.deepToString(ms));
        return (ms[l / m][l % m] == t);
    }

}
