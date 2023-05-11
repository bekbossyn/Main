/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      20:22:40
*/


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CountLargestGroup {

    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int max = -1;
        for (int i = 1; i <= n; i++) {
            int k = count(i);
            h.put(k, h.getOrDefault(k, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() > max) max = entry.getValue();
        }

        int cnt = 0;

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() == max) cnt++;
        }
        return cnt;
    }

    int count(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
