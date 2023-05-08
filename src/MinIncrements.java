public class MinIncrements {

    // global variable
    public static int costDifference;

    public int minIncrements(int n, int[] cost) {
        costDifference = 0;
        int maxCost = dfs(0, cost);
        return costDifference;
    }

    int dfs(int node, int[] cost) {
        if (node >= cost.length) return 0;
        int leftCost = dfs((node + 1) * 2 - 1, cost);
        int rightCost = dfs((node + 1) * 2, cost);
        costDifference += Math.abs(leftCost - rightCost);
        return Math.max(leftCost, rightCost) + cost[node];
    }

}
