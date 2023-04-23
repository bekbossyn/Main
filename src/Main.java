import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();

        out.println(Arrays.toString(new GetSubarrayBeauty().getSubarrayBeauty(new int[]{0,1,2,3,4,5}, 2, 2)));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
