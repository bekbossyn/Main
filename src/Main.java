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
        out.println(new CommonChars().commonChars(new String[]{"bella", "label", "roller"}));
        out.println(new CommonChars().commonChars(new String[]{"cool", "lock", "cook"}));
        out.println(new CommonChars().commonChars(new String[]{"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd"}));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
