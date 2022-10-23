public class MinCost {

    long cost(int[] ns, int[] cost, long number) {
        long result = 0L;
        for (int i = 0; i < ns.length; i++) {
            result += Math.abs(number - ns[i]) * cost[i];
        }
        return result;
    }

    public long minCost(int[] ns, int[] cost) {
        long l = 1L, r = 1000000L;
        long ans = 1000000L;
        while (l < r) {
            long middle = (l + r) / 2;
            long l1 = cost(ns, cost, middle);
            long r1 = cost(ns, cost, middle + 1);
            ans = Math.min(l1, r1);
            if (l1 < r1) {
                r = middle;
            } else {
                l = middle + 1;
            }
        }
        return ans;
    }

}
