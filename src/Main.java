import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();

//        out.println(new Exist().exist(new char[][]{{'A'}}, "A"));
//        out.println(new NumPrimeArrangements().numPrimeArrangements(100));

//        int[] arr = new int[]{4,2,1,4,3,4,5,8,15};
//        int[] arr = new int[]{1,3,5,4,7};
//        int[] arr = new int[]{100,-23,-23,404,100,23,23,23,3,404};
//        System.out.println(new MinJumps().minJumps(arr));
//        int[][] ps = new int[][]{{2, 1}, {3, 4}, {3, 2}};
//        int[][] ps = new int[][]{{4, -2}, {1, 4}, {-3, 1}};
        int[][] ps = new int[][]{{4, -10}, {-1, 3}, {4, -3}, {-3, 3}};
        System.out.println(Arrays.toString(new RestoreArray().restoreArray(ps)));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
