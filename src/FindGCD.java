public class FindGCD {

    public int findGCD(int[] ns) {
        int min = ns[0];
        int max = ns[0];
        for (int i : ns) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        while (min > 0) {
            int c = max % min;
            max = min;
            min = c;
        }
        return max;
    }

}
