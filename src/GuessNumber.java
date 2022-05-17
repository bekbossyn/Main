public class GuessNumber {

    public int guessNumber(int n) {
        int l = 1, r = n;
        int mid = (l + r) / 2;
        int g = -1;
        while (g != 0) {
            // mid = (l + r) / 2;
            mid = l + (r - l) / 2;
            g = guess(mid);
            if (g == -1) {
                r = mid - 1;
            } else if (g == 1) {
                l = mid + 1;
            } else return mid;
            // System.out.println(mid);
        }
        return l;
    }

}
