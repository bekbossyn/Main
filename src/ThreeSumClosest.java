import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] ns, int target) {
        int len = ns.length;
        int cnt = 0;
        for (int n : ns) if (n == 0) cnt++;
        if (cnt == len) return 0;
        Arrays.sort(ns);
        int min = ns[0] + ns[1] + ns[2];
        for (int i = 0; i < len - 2; i++) {
            int l = i + 1, r = len - 1;
            while (l < r) {
                int sum = ns[l] + ns[i] + ns[r];
                if (sum == target) return target;
                if (Math.abs(sum - target) < Math.abs(min - target)) {
                    min = sum;
                } else if (sum < target) l++;
                else r--;
            }
        }
        return min;
    }

}
