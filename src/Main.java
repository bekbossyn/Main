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
//        l = l.toListNode("13,45,32433,23,4,1,,33,3,3,4,5,4,343,2332");
        l = l.toListNode("13,45,132,45,13");
//        l = l.toListNode("1,3,4,7,1,2,6");
        out.println(new IsPalindrome().isPalindrome(l));
//        out.println(new DeleteMiddle().deleteMiddle(l));
//        out.println(Arrays.toString(new KthPalindrome().kthPalindrome(new int[]{2, 4, 6, 90, 10000}, 15)));
//        out.println(new SortList().sortList(l));

        LocalDateTime now1 = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(now, now1);
        out.printf("%.3f\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
