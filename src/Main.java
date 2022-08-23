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
//        int res = new RomanToInt().romanToInt("MCMXCIV");
        out.println(new SmallestNumber().smallestNumber("DD"));
        out.println(new SmallestNumber().smallestNumber("D"));
        out.println(new SmallestNumber().smallestNumber("I"));
//        out.println(new SmallestNumber().smallestNumber("IIIDIDDD"));
//        out.println(new SmallestNumber().smallestNumber("III"));
//        out.println(new SmallestNumber().smallestNumber("IIID"));
//        out.println(new SmallestNumber().smallestNumber("IIIDDI"));
//        out.println(new SmallestNumber().smallestNumber("IIIDDI"));
        in.close();
        out.close();
    }
}
