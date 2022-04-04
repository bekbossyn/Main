public class Fib {

    public int fib(int n) {
        int prev = 0, cur = 1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        while (n-- > 1) {
            int t = cur;
            cur = prev + cur;
            prev = t;
        }
        return cur;
    }

}
