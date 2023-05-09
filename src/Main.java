import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime now = LocalDateTime.now();

//        out.println(Arrays.toString(new GetSubarrayBeauty().getSubarrayBeauty(new int[]{0,1,3,4,5}, 2, 2)));
//        out.println(new MinIncrements().minIncrements(7, new int[]{1, 5, 2, 2, 3, 3, 1}));
//        out.println(new MinIncrements().minIncrements(3, new int[]{5, 3, 3}));
//        out.println(Arrays.toString(new GetSubarrayBeauty().getSubarrayBeauty(new
//        int[]{0,1,3,4,5}, 2, 2)));
//        out.println(new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7));
        out.println(new CombinationSum().combinationSum(new int[]{3,12,9,11,6,7,8,5,4}, 15));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
