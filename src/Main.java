import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime start = LocalDateTime.now();

        out.println(new FindLeastNumOfUniqueInts().findLeastNumOfUniqueInts(new int[]{5,5,5,4,2,2,2,3,3,3,3,3,1,1,4},15));

        LocalDateTime finish = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(start, finish);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
