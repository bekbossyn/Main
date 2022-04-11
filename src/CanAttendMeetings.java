import java.util.Arrays;

public class CanAttendMeetings {

    public boolean canAttendMeetings(int[][] is) {
        Arrays.sort(is, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < is.length - 1; i++) {
            if (is[i][1] > is[i + 1][0]) return false;
        }
        return true;
    }

}
