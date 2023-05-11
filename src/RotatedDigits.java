/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      20:52:20
*/


public class RotatedDigits {

    public int rotatedDigits(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++)
            if (good(i)) cnt++;
        return cnt;
    }

    boolean good(int n) {
        boolean found = false;
        while (n > 0) {
            int nn = n % 10;
            n /= 10;
            if (nn == 3 || nn == 7 || nn == 4) return false;
            if (nn == 2 || nn == 5 || nn == 6 || nn == 9) found = true;
        }
        return found;
    }

}
