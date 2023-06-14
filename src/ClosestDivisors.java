public class ClosestDivisors {

    public int[] closestDivisors(int n) {
        int n1 = 1, n2 = n + 1, n3 = 1, n4 = n + 2;
        for (int i = 2; i <= Math.sqrt(n + 2); i++)
            if ((n + 1) % i == 0 || (n + 2) % i == 0) {
                if ((n + 1) % i == 0) {
                    if (Math.abs(n1 - n2) > Math.abs(i - ((n + 1) / i))) {
                        n1 = i;
                        n2 = (n + 1) / i;
                    }
                }
                if ((n + 2) % i == 0) {
                    if (Math.abs(n3 - n4) > Math.abs(i - ((n + 2) / i))) {
                        n3 = i;
                        n4 = (n + 2) / i;
                    }
                }
            }
        if (Math.abs(n1 - n2) > Math.abs(n3 - n4))
            return new int[]{n3, n4};
        return new int[]{n1, n2};
    }
}