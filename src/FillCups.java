import java.util.Arrays;

public class FillCups {

    public int fillCups(int[] a) {
        Arrays.sort(a);
        // if (a[0]+a[1]+a[2] == 0) return 0;
        return helper(a, 1, 2);
    }

    private int helper(int[] a, int i, int i1) {
        System.out.println(Arrays.toString(a));
        if (i == -1 && i1 == -1) return -1;
        if (i == -1) return a[i1];
        Arrays.sort(a);
        if (a[1] > 0) a[1] -= 1;
        else i = -1;
        if (a[2] > 0) a[2] -= 1;
        else i1 = -1;
        return 1 + helper(a, i, i1);
    }

}
