/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/13
[HH:MM:SS]      22:01:30
*/


public class SingleNonDuplicate {

    public int singleNonDuplicate(int[] ns) {
        // searching for odd positions only
        int i = 0;
        for (i = 0; i < ns.length - 1; i += 2) {
            if (ns[i] != ns[i + 1]) break;
        }
        return ns[i];
    }

}
