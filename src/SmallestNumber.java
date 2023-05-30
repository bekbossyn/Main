import java.util.Arrays;

public class SmallestNumber {

    public String smallestNumber(String p) {
        p = "I" + p;
        String s = "123456789";
        int q = 0;
        if (p.charAt(0) == 'D') {
            int cnt = 1;
            q = 1;
            while (q < p.length() && p.charAt(q) == 'D') q++;
            StringBuilder sb = new StringBuilder(s.substring(0, q));
            sb.reverse();
            s = sb + s.substring(q);

        }
        int i = q;
        while (i < p.length()) {
            if (p.charAt(i) == 'D') {
                int pos = i - 1;
                while (i < p.length() && p.charAt(i) == 'D') i++;
//                if
                StringBuilder sb = new StringBuilder(s.substring(pos, i));
                sb.reverse();
//                if (i >= p.length()) break;

                s = s.substring(0, pos) + sb + s.substring(i);
            } else i++;
        }
        return s.substring(0, p.length());
    }

    public long smallestNumber(long num) {
        int sign = 1;
        if (num < 0) {
            sign = -1;
            num *= -1;
        }
        char[] chars = (String.valueOf(num)).toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        int ind = 0, i = 0;
        for (char c : chars) {
            i++;
            if (!found && c != '0') {
                found = true;
                ind = i - 1;
            }
            sb.append(c);
        }
        if (sign == 1) {
            if (found) {
                char c = sb.charAt(0);
                sb.setCharAt(0, sb.charAt(ind));
                sb.setCharAt(ind, c);
            }
            return Long.parseLong(sb.toString());
        } else {
            return sign * Long.parseLong(sb.reverse().toString());
        }
    }

}
