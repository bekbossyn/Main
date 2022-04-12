public class CheckPerfectNumber {

    //  Euclid - Euler Theorem
    // ([2^(p - 1)] * [2^p - 1] is an even perfect number
    // except prime number 11!!!.
    public boolean checkPerfectNumber(int n) {
        int[] ps = new int[]{2, 3, 5, 7, 13, 17, 19, 31};
        for (int p : ps) {
            if ((1 << (p - 1)) * ((1 << p) - 1) == n) return true;
        }
        return false;
    }
}

/*
public boolean checkPerfectNumber(int n) {
        int sum = 0, ns = n;
        for (int i = 1; i <= (int) Math.sqrt(ns); i++) {
            if (ns % i == 0) {
                sum += i;
                if (i != ns / i) sum += ns / i;
            }
        }
        return sum == n && n > 1;
    }
 */


