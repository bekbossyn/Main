import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime start = LocalDateTime.now();

        out.println(new FractionToDecimal().fractionToDecimal(1,124537));
        out.println(new FractionToDecimal().fractionToDecimal(-50,8));
        out.println(new FractionToDecimal().fractionToDecimal(-1,-2147483648));

        LocalDateTime finish = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(start, finish);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
