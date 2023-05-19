/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/19
[HH:MM:SS]      14:52:16
*/


import java.util.*;

public class MinJumps {

    public int minJumps(int[] arr) {
        int n = arr.length;
        HashMap<Integer, List<Integer>> h = new HashMap<>();
        for (int i = 0; i < n; i++)
            if (h.containsKey(arr[i])) {
                List<Integer> temp = h.get(arr[i]);
                temp.add(i);
                h.put(arr[i], temp);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                h.put(arr[i], temp);

            }
        Queue<Integer> q = new LinkedList<>();
        boolean[] used = new boolean[n];
        q.add(0);
        used[0] = true;
        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int cur = q.remove();
                if (cur == n - 1) return cnt;
                List<Integer> list = h.get(arr[cur]);
                list.add(cur + 1);
                list.add(cur - 1);
                for (int ind : list) {
                    if (ind > 0 && ind < n && !used[ind]) {
                        q.add(ind);
                        used[ind] = true;
                    }
                }
                list.clear();
            }
            cnt++;
        }
        return -1;
    }

}
