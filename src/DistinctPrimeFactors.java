import java.util.HashSet;

public class DistinctPrimeFactors {

    public int distinctPrimeFactors(int[] ns) {
        HashSet<Integer> set = new HashSet<>();
        int[] primes = new int[201];
        primes[0] = 2;
        int cnt = 1, i = 3;
        while (cnt < 200) {
            if (isPrime(i)) {
                primes[cnt++] = i;
            }
            i += 2;
        }
        for (int n : ns) {
            if (n >= 2) {
                while (n > 1) {
                    int k = 0;
                    while (n % primes[k] != 0) k++;
                    set.add(primes[k]);
                    n /= primes[k];
                }
            }
        }
        return set.size();
    }

    private boolean isPrime(int n) {
        for (int i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) return false;
        return true;
    }

}
