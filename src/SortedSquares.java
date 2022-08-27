import java.util.Arrays;

public class SortedSquares {
    // O(n*n) || O(n log n)
    public int[] sortedSquares1(int[] ns) {
        for (int i = 0; i < ns.length; i++)
            ns[i] = ns[i] * ns[i];
        Arrays.sort(ns);
        return ns;
    }

    // #TODO O(n)
    public int[] sortedSquares(int[] ns) {
        int[] res = new int[ns.length];
        res[0] = ns[0];
        int l = 0;
        int r = ns.length - 1;
        int i = ns.length - 1;
        while (l < r) {
            if (Math.abs(ns[l]) > Math.abs(ns[r])) {
                res[i] = ns[l] * ns[l];
                l++;
            } else {
                res[i] = ns[r] * ns[r];
                r--;
            }
            i--;
        }
        return res;
    }

}

}
