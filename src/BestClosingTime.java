import java.util.Arrays;

public class BestClosingTime {

    public int bestClosingTime(String cs) {
        int len = cs.length();
        int[] fy = new int[len + 1];
//        int[] fn = new int[len + 1];
//        int[] by = new int[len + 1];
        int[] bn = new int[len + 1];
        int min = 0;
        for (int i = 1; i <= len; i++) {
            if (i < len && cs.charAt(i - 1) == 'Y') {
//                by[i] = by[i - 1] + 1;
                bn[i] = bn[i - 1];
            } else if (i < len) {
//                by[i] = by[i - 1];
                bn[i] = bn[i - 1] + 1;
            } else {
                bn[i] = bn[i - 1];
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (cs.charAt(i) == 'Y') {
                fy[i] = fy[i + 1] + 1;
//                fn[i] = fn[i + 1];
            } else {
                fy[i] = fy[i + 1];
//                fn[i] = fn[i + 1] + 1;
            }
        }
        System.out.println(Arrays.toString(fy));
        System.out.println(Arrays.toString(bn));
        int index = 0;
        int mini = 100001;
        for (int i = 0; i <= len; i++) {
            System.out.println(fy[i] + bn[i]);
            if (mini > fy[i] + bn[i]) {
                index = i;
                mini = fy[i] + bn[i];
            }
        }
        return index;
    }

}
