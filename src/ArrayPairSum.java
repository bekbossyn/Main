import java.util.Arrays;

public class ArrayPairSum {

    public int arrayPairSum(int[] ns) {
        Arrays.sort(ns);
        int result = 0;
        for (int i = ns.length - 1; i > 0; i -= 2) {
            result += ns[i - 1];
        }
        return result;
    }

}
