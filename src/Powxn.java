public class Powxn {
    public double myPow(double x, int n) {
        if (x != 0) return Math.pow(x, n);
        if (n == 1) return x;
        if (n < 0) {
            if (x > 0.00000)
                return myPow(1.0 / x, -n);
            else
                return x;
        } else if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 0)
                return myPow(x * x, n / 2);
            else
                return x * myPow(x, n - 1);
        }
    }
}
