import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();

        out.println(new FindFinalValue().findFinalValue(new int[]{2, 7, 9}, 4));
        out.println(new MissingNumber().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
