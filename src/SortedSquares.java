import java.util.Arrays;

public class SortedSquares {
    // O(n*n) || O(n log n)
    public int[] sortedSquares(int[] ns) {
        for (int i = 0; i < ns.length; i++)
            ns[i] = ns[i] * ns[i];
        Arrays.sort(ns);
        return ns;
    }
    // #TODO O(n)

}
