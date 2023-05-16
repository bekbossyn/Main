/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      22:30:05
*/


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

}
