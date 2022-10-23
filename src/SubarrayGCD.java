import java.util.Stack;

public class SubarrayGCD {

    public int subarrayGCD(int[] ns, int k) {
        int len = ns.length;
        boolean[] used = new boolean[len];
        for (int i = 0; i < len; i++) if (ns[i] % k == 0) used[i] = true;
        Stack<Integer> stBegin = new Stack<>();
        Stack<Integer> stEnd = new Stack<>();
        int i = 0;
        while (i < len) {
            if (used[i]) {
                stBegin.push(i);
                int j = i;
                while (j < len && used[j]) j++;
                stEnd.push(j);
                i = j - 1;
            }
            i++;
        }
        int count = 0;
        // for (int q = 0;q<len;q++) if (ns[q]==k  || k == 1) count++;
        while (!stBegin.empty()) {
            int start = stBegin.pop();
            int end = stEnd.pop();
            for (int ii = start; ii < end; ii++)
                for (int jj = ii; jj < end; jj++)
                    if (gcd(ii, jj, ns, k)) count++;
        }
        return count;
    }

    boolean gcd(int start, int end, int[] ns, int k) {
        // if (start +1 >=end) return false;
        // if (start == end || end-start == 1) {
        //     // if (k == 1) return true;
        //     // return ns[start] == k;
        //     return false;
        // }
        int gccd = ns[start];
        for (int i = start + 1; i <= end; i++) {
            gccd = gcccd(gccd, ns[i]);
        }
//        for (int i = start; i < end; i++)
//            if (ns[i] % k != 0) return false;
//        int min = ns[start];
//        for (int i = start; i < end; i++) if (ns[i] < min) min = ns[i];
//        if (min > k) {
//            int count = 0;
//            for (int i = start; i < end; i++)
//                if (ns[i] % min == 0) count++;
//            if (count == end - start) return false;
//        }
        // System.out.println("gccd:" +gccd);
        // for (int i = start; i <= end; i++) System.out.print(ns[i]+ " ");
        // System.out.println();
        return gccd == k;
    }

    int gcccd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}
