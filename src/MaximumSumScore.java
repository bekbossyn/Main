public class MaximumSumScore {

    public long maximumSumScore(int[] ns) {
        if (ns.length == 1) return ns[0];
        long total = 0, sum = 0, max = ns[0];
        for (int n : ns) total += n;
        for (int i = 0; i < ns.length - 1; i++) {
            if (max < total) max = total;
            if (max < sum && i != 0) max = sum;
            total = total - ns[i];
            sum = sum + ns[i];
        }
        if (max < total) max = total;
        if (max < sum) max = sum;
        return max;
    }

}
