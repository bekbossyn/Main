/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/15
[HH:MM:SS]      18:29:34
*/


public class PrimePalindrome {

    public int primePalindrome(int n) {
        if (n <=11) {
            for (int i = n; i <12;i++) {
                if (isPrime(i)) return i;
            }
        }
        for (int pow = 1; pow <= 5; pow++) {
            for (int root = (int) Math.pow(10, pow - 1); root < (int) Math.pow(10, pow); root++) {
                StringBuilder sb = new StringBuilder(String.valueOf(root));
                if (!(sb.charAt(0) == '5')) {
                    for (int i = sb.length() - 2; i >= 0; i--) sb.append(sb.charAt(i));
                    int value = Integer.parseInt(sb.toString());
                    if (value >= n && isPrime(value))
                        return value;
                }
            }
        }
        return 0;
    }

    boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 3 || n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
