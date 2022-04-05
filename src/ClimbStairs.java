public class ClimbStairs {

    public int climbStairs(int n) {
        int[] ns = new int[46];
        ns[0] = 1;
        ns[1] = 1;
        for (int i = 2; i <= n; i++) {
            ns[i] = ns[i - 1] + ns[i - 2];
        }
        return ns[n];
    }

}
