/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      23:05:47
*/


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CanJump {

    public boolean canJump(int[] ns) {
        int len = ns.length;
        boolean[] visited = new boolean[len];
        int[] b = new int[len];
        Arrays.fill(b, -1);
        b[0] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty() && !visited[len - 1]) {
            int curIndex = queue.remove();
            visited[curIndex] = true;
            int bestIndex = -1;
            for (int i = curIndex + 1; i < Math.min(len, curIndex + ns[curIndex] + 1); i++) {
                if (!visited[i] && (bestIndex == -1 || ns[i] + i > ns[bestIndex]+bestIndex)) {
                    bestIndex = i;
                }
                visited[i] = true;
            }
            if (bestIndex != -1)
                queue.add(bestIndex);
        }
        return visited[len - 1];
    }

}
