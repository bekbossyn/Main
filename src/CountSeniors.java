/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/13
[HH:MM:SS]      23:30:55
*/


public class CountSeniors {


    public int countSeniors(String[] D) {
        int count = 0;
        for (int i = 0; i < D.length; i++) {
            String s = D[i].substring(11, 13);
            if (Integer.parseInt(s) > 60) count++;
        }
        return count;
    }
}
