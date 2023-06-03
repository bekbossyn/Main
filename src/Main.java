import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime start = LocalDateTime.now();

        out.println(new FractionAddition().fractionAddition("-1/2+1/2+1/9-7/8+9/1"));

        LocalDateTime finish = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(start, finish);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
