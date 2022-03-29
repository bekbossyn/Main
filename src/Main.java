import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();


        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f\n", secs / 1000.0);
        new SearchMatrix().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        in.close();
        out.close();
    }
}
