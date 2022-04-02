import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfWays {

    public long numberOfWays(String s) {
        char ch = '3';
        int cnt = 0;
        int total = 0;
        StringBuilder ss = new StringBuilder(s);
        Queue<Integer> qs = new LinkedList<>();
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == ch) {
                cnt++;
            } else {
                qs.add(cnt);
                total++;
                cnt = 1;
            }
            ch = ss.charAt(i);
        }
        total++;
        qs.add(cnt);
        int[] ns = new int[total];
        for (int i = 0; i < total; i++) ns[i] = qs.remove();
        long res = 0;
        System.out.println(Arrays.toString(ns));
        for (int i = 1; i < total; i += 2)
            for (int j = i + 1; j < total; j += 2)
                for (int k = j + 1; k < total; k += 2) {
//                    System.out.println(i + " " + j + " " + k);
                    res += (long) ns[i] * ns[j] * ns[k];
                    if (k < total - 1)
                        res += (long) ns[i + 1] * ns[j + 1] * ns[k + 1];
                }
        System.out.println(total);
        return res;
    }

}
