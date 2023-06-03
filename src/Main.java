import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime start = LocalDateTime.now();

        out.println(new Calculate().calculate("2147483647"));// -23
        out.println(new Calculate().calculate("(1-(4+5-2)  -3)-(6+8)"));// -23
        out.println(new Calculate().calculate("-(1+2-3+(2-3)-(4-8))")); // -3
        out.println(new Calculate().calculate("(1+2-3+(2-3)-(4-8))"));  // 3
        out.println(new Calculate().calculate("(1+2-3+(2-3)+(4-8))")); // -5
        out.println(new Calculate().calculate("-(1+2-3+(2-3)+(4-8))")); // 5

        LocalDateTime finish = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(start, finish);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
