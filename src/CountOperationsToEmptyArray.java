/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/13
[HH:MM:SS]      21:21:37
*/


import java.util.Arrays;
import java.util.HashMap;

public class CountOperationsToEmptyArray {

    public long countOperationsToEmptyArray(int[] ns) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int n = ns.length;
        long result = n;
        for (int i = 0; i < n; i++) {
            h.put(ns[i], i);
        }
        Arrays.sort(ns);
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (h.get(ns[i]) < value) {
                result += n - i;
            }
            value = h.get(ns[i]);
        }
        return result;
    }

}
