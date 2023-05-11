/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      20:39:30
*/


public class NumIdenticalPairs {

    public int numIdenticalPairs(int[] ns) {
        int cnt = 0;
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = i + 1; j < ns.length; j++)
                if (ns[i] == ns[j]) cnt++;
        }
        return cnt;
    }

}
