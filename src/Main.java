import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();

        out.println(new NextGreaterElement3().nextGreaterElement(2147483476));
//        out.println(new NextGreaterElement3().nextGreaterElement(20123321));
//        out.println(new NextGreaterElement3().nextGreaterElement(4531));
//        out.println(new NextGreaterElement3().nextGreaterElement(12));
//        out.println(new NextGreaterElement3().nextGreaterElement(987854321));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f", secs / 1000.0);

        in.close();
        out.close();
    }
}
