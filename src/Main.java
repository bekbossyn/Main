import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        LocalDateTime start = LocalDateTime.now();

//        out.println(new RankTeams().rankTeams(new String[]{"BCA","CAB","CBA","ABC","ACB","BAC"}));
        out.println(new LargestWordCount().largestWordCount(new String[]{"Hello userTwooo", "Hi userThree asd asd asd", "Wonderful day Alice", "Nice day userThree"}, new String[]{"Alice", "userTwo", "userThree", "Alice"}));

        LocalDateTime finish = LocalDateTime.now();
        long secs = ChronoUnit.MILLIS.between(start, finish);
        out.printf("%.3f seconds\n", secs / 1000.0);

        in.close();
        out.close();
    }
}
