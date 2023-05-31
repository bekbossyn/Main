import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Comparator;

public class NearestValidPoint {

    static int px;
    static int py;

    class Point {
        int x, y, index;

        Point(int x, int y, int index) {
            this.x = x;
            this.y = y;
            this.index = index;
        }

        public static int compare(Point p1, Point p2) {
            int d1 = Math.abs(px - p1.x) + Math.abs(py - p1.y);
            int d2 = Math.abs(px - p2.x) + Math.abs(py - p2.y);
            if (d1 == d2) {
                return p1.index - p2.index;
            } else return d1 - d2;
        }

        public String toString() {
            return "Index: " + this.index + ", xy: " + this.x + " " + this.y;
        }

    }

    public int nearestValidPoint(int x, int y, int[][] ps) {
        px = x;
        py = y;

        int cnt = 0;
        for (int[] p : ps)
            if (p[0] == x || p[1] == y) cnt++;
        if (cnt == 0) return -1;
        Point[] points = new Point[cnt];
        cnt = 0;
        int index = 0;
        for (int[] p : ps) {
            if (p[0] == x || p[1] == y) {
                points[cnt++] = new Point(p[0], p[1], index);
            }
            index++;
        }
        Arrays.sort(points, Point::compare);
        System.out.println(Arrays.toString(points));
//        Arrays.sort(ps, Comparator.comparingInt(p -> (Math.abs(p[1] - y) + Math.abs(p[0] - x))));
//        System.out.println(ps[0][0] + " " + ps[0][1]);
//        if (x == ps[0][0] || y == ps[0][1]) {
//            int d =
//        }
        if (points[0].x == x || points[0].y == y) return points[0].index;
        return -1;
    }

}
