public class CheckPerfectNumber {

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
}


