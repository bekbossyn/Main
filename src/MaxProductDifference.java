import java.util.Arrays;

public class MaxProductDifference {

    public int maxProductDifference(int[] ns) {
        Arrays.sort(ns);
        return ns[ns.length - 1] * ns[ns.length - 2] - ns[0] * ns[1];
    }

}
