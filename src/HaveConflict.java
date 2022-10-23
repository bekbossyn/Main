public class HaveConflict {

    public boolean haveConflict(String[] e1, String[] e2) {
        int h1, m1, h2, m2;
        h1 = Integer.valueOf(e1[0].substring(0, 2));
        m1 = Integer.valueOf(e1[0].substring(3));
        h2 = Integer.valueOf(e1[1].substring(0, 2));
        m2 = Integer.valueOf(e1[1].substring(3));
        int hh1, mm1, hh2, mm2;
        hh1 = Integer.valueOf(e2[0].substring(0, 2));
        mm1 = Integer.valueOf(e2[0].substring(3));
        hh2 = Integer.valueOf(e2[1].substring(0, 2));
        mm2 = Integer.valueOf(e2[1].substring(3));

        int st1 = h1 * 60 + m1;
        int end1 = h2 * 60 + m2;
        int st2 = hh1 * 60 + mm1;
        int end2 = hh2 * 60 + mm2;
        return (st1 >= st2 && st1 <= end2) || (st2 >= st1 && st2 <= end1);
    }

}
