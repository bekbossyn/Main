import java.util.HashMap;

public class CountDaysTogether {

    final int[] m = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String aA, String lA, String aB, String lB) {

        int m1 = Integer.parseInt(aA.substring(0, 2));
        int d1 = Integer.parseInt(aA.substring(3));
        int mm1 = Integer.parseInt(aB.substring(0, 2));
        int dd1 = Integer.parseInt(aB.substring(3));
        int m2 = Integer.parseInt(lA.substring(0, 2));
        int d2 = Integer.parseInt(lA.substring(3));
        int mm2 = Integer.parseInt(lB.substring(0, 2));
        int dd2 = Integer.parseInt(lB.substring(3));

        int cnt = 0;

        HashMap<String, Boolean> h = new HashMap<>();
        int am1 = m1;
        int ad1 = d1;
        while (true) {
            h.put(am1 + "," + ad1, true);
            if (am1 == m2 && ad1 == d2) break;
            ad1++;
            if (ad1 > m[am1]) {
                ad1 = 1;
                am1++;
            }
            if (am1 > 12) am1 = 1;
        }


        int am2 = mm1;
        int ad2 = dd1;
        while (true) {
            if (h.containsKey(am2 + "," + ad2)) cnt++;
            if (am2 == mm2 && ad2 == dd2) break;
            ad2++;
            if (ad2 > m[am2]) {
                ad2 = 1;
                am2++;
            }
            if (am2 > 12) am2 = 1;
        }

        return cnt;
    }


}
