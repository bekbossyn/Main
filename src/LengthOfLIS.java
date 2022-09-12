import java.util.Arrays;

public class LengthOfLIS {

    public int lengthOfLIS(int[] ns) {
        int len = ns.length;
        int[] b = new int[len];
        int max = 1;
        for (int i = 0; i < len; i++) {
            b[i] = 1;
            for (int j = i - 1; j >= 0; j--)
                if (ns[i] > ns[j] && (b[i] < b[j] + 1)) {
                    b[i] = b[j] + 1;
                    if (b[i] > max) {
                        max = Math.max(max, b[i]);
                        break;
                    }
                }
        }
        return max;
    }

    public int lengthOfLIS(int[] ns, int k) {
        int len = ns.length;
        int[] b = new int[len];
//        b[0] = 1;
        int max = 1;
        for (int i = 0; i < len; i++) {
            b[i] = 1;
            for (int j = i - 1; j >= 0; j--)
                if (ns[i] > ns[j] && ns[i] - ns[j] <= k && (b[i] < b[j] + 1)) {
                    b[i] = b[j] + 1;
                    if (b[i] > max) {
                        max = Math.max(max, b[i]);
                        break;
                    }
                }
//            System.out.println(Arrays.toString(b));
        }
        return max;
//        int maxi = 1;
//        for (int i = 0; i < len; i++) if (b[i] > maxi) maxi = b[i];
////        System.out.println(Arrays.toString(b));
//        return maxi;
    }

}
