/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/19
[HH:MM:SS]      17:06:02
*/


import java.util.*;

public class RestoreArray {

    public int[] restoreArray(int[][] ps) {
        int n = ps.length + 1;
        boolean[] used = new boolean[n];
        int[] result = new int[n];
        HashMap<Integer, Integer> keys = new HashMap<>();
        HashMap<Integer, List<Integer>> h = new HashMap<>();
        int head = 0;
        int counter = 0;
        for (int[] p : ps) {
            int x = p[0], y = p[1];
            if (!keys.containsKey(x)) {
                keys.put(x, counter++);
            }
            if (!keys.containsKey(y)) {
                keys.put(y, counter++);
            }

            List<Integer> l = h.getOrDefault(x, new ArrayList<>());
            l.add(y);
            h.put(x, new ArrayList<>(l));
            l.clear();

            l = h.getOrDefault(y, new ArrayList<>());
            l.add(x);
            h.put(y, new ArrayList<>(l));
            l.clear();

        }

        for (int key : h.keySet()) {
            if (h.get(key).size() == 1) {
                head = key;
                break;
            }
        }

        int cnt = 0;
        while (!used[keys.get(head)]) {
            result[cnt++] = head;
            used[keys.get(head)] = true;
            List<Integer> l = h.get(head);
            int i = 0;
            for (i = 0; i < l.size(); i++) {
                if (!used[keys.get(l.get(i))]) {
                    head = l.get(i);
                    break;
                }
            }
        }
        return result;
    }

}
