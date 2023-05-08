public class MinIncrements {

    // global variable
    public static int correction;

    public int minIncrements(int n, int[] cost) {
        correction = 0;
        int maxCost = dfs(0, cost);
        return correction;
    }

    int dfs(int node, int[] cost) {
        if (node >= cost.length) return 0;
        int leftCost = dfs((node + 1) * 2 - 1, cost);
        int rightCost = dfs((node + 1) * 2, cost);
        correction += Math.abs(leftCost - rightCost);
        return Math.max(leftCost, rightCost) + cost[node];
    }

}
