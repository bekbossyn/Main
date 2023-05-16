/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      21:39:56
*/


public class NumPrimeArrangements {

    public int numPrimeArrangements(int n) {
        int cnt = count(n);
        int rest = n - cnt;
        long modulo = 1000000007;
        long res = 1;
        for (long i = 2; i <= Math.max(rest, cnt); i++) {
            if (i <= Math.min(rest, cnt)) {
                res = (res * (i * i % modulo)) % modulo;
            } else {
                res = (res * i) % modulo;
            }
        }
        return (int) res;
    }

    int count(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++)
            if (prime(i)) cnt++;
        return cnt;
    }

    boolean prime(int n) {
        if (n < 3) return n == 2;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) return false;
        return true;
    }

}
