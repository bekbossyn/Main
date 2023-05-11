/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      20:45:13
*/


public class NumSub {

    public int numSub(String s) {
        int res = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                res = (res+count) % 1_000_000_007;
            } else count = 0;
        }
        return res;
    }

}
