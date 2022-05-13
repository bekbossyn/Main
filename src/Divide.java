public class Divide {

    public int divide(int d, int v) {
        long res = (long)d /(long) v;
        if (res > Integer.MAX_VALUE) res = Integer.MAX_VALUE;
        return (int)res;
    }

}
