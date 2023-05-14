/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/15
[HH:MM:SS]      03:50:38
*/


public class DiagonalPrime {

    public int diagonalPrime(int[][] ns) {
        int max = 0, n = ns.length;

        for (int i = 0; i < n; i++) {
            if (isPrime(ns[i][i]) && ns[i][i] > max) max = ns[i][i];
            if (isPrime(ns[i][n - 1 - i]) && ns[i][n - 1 - i] > max) max = ns[i][n - 1 - i];
        }
        return max;
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
