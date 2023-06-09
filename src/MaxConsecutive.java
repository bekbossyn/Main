import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxConsecutive {

    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < special.length; i++)
            max = Math.max(max, special[i] - special[i - 1] - 1);

        max = Math.max(max, special[0] - bottom);
        max = Math.max(max, top - special[special.length - 1]);
        return max;
    }

}
