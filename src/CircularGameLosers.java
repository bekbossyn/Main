/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/19
[HH:MM:SS]      16:58:42
*/


import java.util.Arrays;

public class CircularGameLosers {

    public int[] circularGameLosers(int n, int k) {
        int i = 0;
        boolean[] b = new boolean[n];
        int current = 0;
        while (!b[current]) {
            i++;
            b[current] = true;
            current = (current + k * i) % n;
        }
        int cnt = 0;
        for (boolean b1 : b) if (!b1) cnt++;
        int[] res = new int[cnt];
        cnt = 0;
        for (int j = 0; j < n; j++)
            if (!b[j]) res[cnt++] = j + 1;
        return res;
    }

}
