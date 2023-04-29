public class MaximizeSum {

    public int maximizeSum(int[] ns, int k) {
        int max = ns[0];
        for (int n : ns) if (max < n) max = n;
        int sum = 0;
        while (k > 0) {
            k--;
            sum += max;
            max++;
        }
        return sum;
    }

}
