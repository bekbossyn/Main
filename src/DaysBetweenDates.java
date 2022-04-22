public class DaysBetweenDates {

    public int daysBetweenDates(String d1, String d2) {
        int y1 = Integer.parseInt(d1.substring(0, 4));
        int m1 = Integer.parseInt(d1.substring(5, 7));
        int dd1 = Integer.parseInt(d1.substring(8));
        int y2 = Integer.parseInt(d2.substring(0, 4));
        int m2 = Integer.parseInt(d2.substring(5, 7));
        int dd2 = Integer.parseInt(d2.substring(8));
        return Math.abs(f(y1, m1, dd1) - f(y2, m2, dd2));
    }

    int f(int y, int m, int d) {
        int[] ms = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int iy = 1900, im = 1, id = 1;
        int cnt = 0;
        while (iy < y || (iy == y && im < m) || (iy == y && im == m && id < d)) {
            cnt++;
            id++;
            if (id > ms[im]) {
                if (im == 2 && id == 29) {
                    if (!leap(iy)) {
                        im++;
                        id = 1;
                    }
                } else {
                    im++;
                    id = 1;
                }
                if (im > 12) {
                    im = 1;
//                    id = 1;
                    iy++;
                }
            }
        }
        return cnt;
    }

    boolean leap(int year) {

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                return year % 400 == 0;
            }

            // if the year is not century
            else
                return true;
        } else
            return false;
    }

}
