import java.util.Arrays;

public class SortTransformedArray {

    public int[] sortTransformedArray(int[] ns, int a, int b, int c) {
        for (int i = 0; i < ns.length; i++) {
            ns[i] = a * ns[i] * ns[i] + b * ns[i] + c;
        }
        Arrays.sort(ns);
        return ns;
    }

}
