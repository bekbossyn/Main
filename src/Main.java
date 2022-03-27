import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();

        ListNode l = new ListNode();
        l = l.toListNode("1");
        out.println(new SwapPairs().swapPairs(l));
        out.println(new SwapPairs().swapPairs(null));
        l = l.toListNode("1,2,3,4,5,6,7,8,9,10");
        out.println(new SwapPairs().swapPairs(l));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
