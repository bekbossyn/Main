import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SmallestValue {

    public int smallestValue(int n) {
        if (n == 4) return 4;
        List<Integer> primes = new ArrayList<>();
        int pr = 3;
        primes.add(2);
        int cnt = 1;
        while (pr < n) {
            while (!isPrime(pr)) pr += 2;
            primes.add(pr);
            pr += 2;
        }
        while (!isPrime(n)) {
            List<Integer> list = new ArrayList<>();
            while (n > 1) {
                int i = 0;
                while (n % primes.get(i) != 0) i++;
                list.add(primes.get(i));
                n /= primes.get(i);
            }
            n = 0;
            for (Integer l : list) {
                n += l;
            }
        }
        return n;
    }

    boolean isPrime(int n) {
        if (n % 2 == 0) return n == 2;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 2;
    }

}
