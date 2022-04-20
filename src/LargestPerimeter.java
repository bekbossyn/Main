import java.util.Arrays;

public class LargestPerimeter {

    public int largestPerimeter(int[] ns) {
        int max = 0;
        Arrays.sort(ns);
        for (int i = ns.length - 3; i >= 0; i--)
            for (int j = ns.length - 2; j > i; j--)
                for (int k = ns.length - 1; k > j; k--) {
                    int a = ns[i], b = ns[j], c = ns[k];
                    if (max < a + b + c && (a + b > c && a + c > b && c + b > a)) {
                        max = a + b + c;
                        return max;
                    }
                }
        return 0;
    }

}

