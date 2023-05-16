/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      23:35:31
*/


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Jump {

    public int jump(int[] ns) {
        int len = ns.length;
        boolean[] visited = new boolean[len];
        int[] b = new int[len];
        Arrays.fill(b, 100001);
        b[0] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int curIndex = queue.remove();
            visited[curIndex] = true;
            int bestIndex = -1;
            for (int i = curIndex + 1; i < Math.min(len, curIndex + ns[curIndex] + 1); i++) {
                if (!visited[i] && (bestIndex == -1 || (b[i] >= b[curIndex] + 1))) {
                    if (bestIndex == -1) {
                        bestIndex = i;
                    } else if (ns[i] + i > ns[bestIndex] + bestIndex) {
                        bestIndex = i;
                    }
                    b[i] = Math.min(b[curIndex] + 1, b[i]);
                }
            }
            if (bestIndex != -1)
                queue.add(bestIndex);
        }
        return b[len - 1];
    }

}
