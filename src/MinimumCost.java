import java.util.Arrays;

public class MinimumCost {

    public int minimumCost(int[] cost) {
        int result = 0;
        Arrays.sort(cost);
        for (int i = cost.length - 1; i >= 0; i--) {
            if (i >= 2) {
                result += cost[i] + cost[i - 1];
                i -= 2;
            } else {
                result += cost[i];
            }
        }
        return result;
    }

}
