/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      22:30:05
*/


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CanReach {

    public boolean canReach(int[] arr, int start) {
        return check(new boolean[arr.length], arr, start);
    }

    boolean check(boolean[] visited, int[] arr, int index) {
        if (arr[index] == 0) return true;
        if (visited[index]) return false;
        visited[index] = true;
        boolean first = false;
        boolean second = false;
        if (index + arr[index] >= 0 && index + arr[index] < arr.length) {
            first = check(visited, arr, index + arr[index]);
        }
        if (index - arr[index] >= 0 && index - arr[index] < arr.length) {
            second = check(visited, arr, index - arr[index]);
        }
        return first || second;
    }

    public boolean canReach(String s, int minJump, int maxJump) {
        int len = s.length();
        boolean[] visited = new boolean[len];
        int[] b = new int[len];
        Arrays.fill(b, 100001);
        b[0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty() && !visited[len - 1]) {
            int curIndex = q.remove();
            visited[curIndex] = true;
            int cnt = 0;
            for (int i = Math.min(len - 1, curIndex + maxJump); i >= curIndex + minJump; i--) {
                if (s.charAt(i) == '0' && !visited[i]) {
                    b[i] = b[curIndex] + 1;
                    q.add(i);
                    visited[i] = true;
                    cnt++;
                    if (cnt >= minJump)
                        break;
                }
            }
        }

        return visited[len - 1];
    }


}
