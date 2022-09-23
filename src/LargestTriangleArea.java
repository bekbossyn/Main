public class LargestTriangleArea {

    public double largestTriangleArea(int[][] ps) {
        double max = -1;
        for (int i = 0; i < ps.length - 2; i++)
            for (int j = i + 1; j < ps.length - 1; j++)
                for (int k = j + 1; k < ps.length; k++)
                    max = Math.max(max, area(ps[i][0], ps[i][1], ps[j][0], ps[j][1], ps[k][0], ps[k][1]));
        return max;
    }

    double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

}
