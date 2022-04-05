public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] ns = new int[len + 1];
        ns[0] = cost[0];
        ns[1] = cost[1];
        for (int i = 2; i < len; i++) {
            ns[i] = cost[i] + Math.min(ns[i - 1], ns[i - 2]);
        }
        return Math.min(ns[len - 2], ns[len - 1]);
    }

}
