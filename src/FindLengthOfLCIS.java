/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/18
[HH:MM:SS]      23:05:24
*/


import java.util.Arrays;

public class FindLengthOfLCIS {

    public int findLengthOfLCIS(int[] ns) {
        int[] b = new int[ns.length];
        Arrays.fill(b, 1);
        for (int i = 1; i < ns.length; i++) {
            if (ns[i] > ns[i - 1]) {
                b[i] = b[i - 1] + 1;
            }
        }
        int max = b[0];
        for (int n : b)
            if (n > max) max = n;
        return max;
    }

}
