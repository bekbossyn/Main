import java.util.Arrays;

public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] ns) {
        int max = 0;
        int cnt = 0;
        int prev = 0;
        for (int i = 0; i < ns.length; i++) {
            if (ns[i] == 1 && prev == 1) {
                cnt++;
            } else {
                cnt = 0;
                prev = ns[i];
                if (prev == 1) cnt++;
            }
            max = Math.max(cnt, max);
        }
        return max;
    }

    public int findMaxConsecutiveOnesII(int[] ns) {
        int l = ns.length;
        int[] b = new int[l];

        if (ns[0] == 1) b[0] = 1;

        int max = b[0];

        for (int i = 1; i < l; i++) {
            if (ns[i] == 1) b[i] = b[i - 1] + 1;
            max = Math.max(b[i], max);
        }

        if (max <l)
            max = max + 1;

        for (int i = l - 1; i > 0; i--)
            if (b[i] > 0 && b[i - 1] > 0) b[i - 1] = b[i];

        System.out.println(Arrays.toString(b));
        for (int i = 1; i < l - 1; i++)
            if (b[i] == 0 && b[i - 1] != 0 && b[i + 1] != 0) {
                max = Math.max(max, b[i - 1] + b[i + 1] + 1);
            }
//        if (b[l - 1] != 0) max = Math.max(max, b[l - 1] + 1);
//        if (b[l - 1] == 0 && l > 1 && b[l - 2] != 0) max = Math.max(max, b[l - 2] + 1);
        return max;
    }

}
