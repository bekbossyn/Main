public class IsThree {

    public boolean isThree(int n) {
        if (((int)(Math.sqrt(n)) * (int)Math.sqrt(n) == n)) {
            int nSqrt = (int)Math.sqrt(n);
            for (int i = 2; i < nSqrt; i++)
                if (nSqrt % i == 0) return false;
            return n > 1;
        }
        return false;
    }

}
