import java.util.Arrays;

public class CountPrimes {
    // time limit
    // O(n^2)
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    /*
    n   =   5000000
    cnt =   348513
     */

    // O(n)
    public int countPrimes(int n) {
        if (n < 2) return 0;
        int count = 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, Boolean.TRUE);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < n; i++)
            if (primes[i]) {
                for (long j = (long) i * i; j < n; j += i) {
                    if (j < n) {
                        primes[(int) j] = false;
                    }
                }
            }
        for (int i = 0; i < n; i++) {
            if (primes[i]) count++;
        }
        return count;
    }
}
