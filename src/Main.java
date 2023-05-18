import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();

//        out.println(new Exist().exist(new char[][]{{'A'}}, "A"));
//        out.println(new NumPrimeArrangements().numPrimeArrangements(100));

        int[] arr = new int[]{4,2,1,4,3,4,5,8,15};
        System.out.println(new LengthOfLIS().lengthOfLIS(arr,3));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
