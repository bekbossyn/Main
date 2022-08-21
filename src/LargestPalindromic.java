import java.util.Arrays;
import java.util.HashMap;

public class LargestPalindromic {

    public String largestPalindromic(String num) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) a[i] = 0;
        for (char c : num.toCharArray()) {
            a[c - 48]++;
        }
        StringBuilder s = new StringBuilder();
        boolean used = true;
        while (used) {
            used = false;
            for (int i = 9; i >= 1; i--) {
                while (a[i] > 1) {
                    used = true;
                    s.append(Integer.toString(i));
                    a[i] -= 2;
                }
            }
        }
        if (s.length() >= 1) {
            int aa = 0;
            if (a[0] > 1) {
                for (int q = 0; q < a[0] / 2; q++) {
                    aa++;
                    s.append('0');
                }
                a[0] -= aa * 2;
            }
        }
        System.out.println(Arrays.toString(a));
        if (s.length() == 0) {
            int qq = 0;
            for (int i = 1; i < 10; i++)
                if (a[i] > 0) qq++;
            if (qq == 0)
                return "0";
        }
        String sss = s.toString();
        StringBuilder ss = s.reverse();
        System.out.println(s.toString());

        for (int i = 9; i >= 0; i--) {
            if (a[i] == 1) {
//                s.append(Integer.toString(i));
                sss += Integer.toString(i);
                break;
            }
        }
//        s.append(ss);
        return sss + s.toString();
    }
}
