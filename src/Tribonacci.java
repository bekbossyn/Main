public class Tribonacci {

    public int tribonacci(int n) {
        int[] ns = new int[38];
        ns[1] = 1;
        ns[2] = 1;
        for (int i = 3; i <= n; i++) {
            ns[i] = ns[i - 1] + ns[i - 2] + ns[i - 3];
        }
        return ns[n];
    }

}
