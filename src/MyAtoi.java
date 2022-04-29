public class MyAtoi {

    public int myAtoi(String s) {
        if (s.length() < 2) {
            if (s.length() == 0) return 0;
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
                return Integer.parseInt(s);
            return 0;
        }
        int i = 0;
        while (i < s.length() && (s.charAt(i) == ' '))
            i++;
        if (i == s.length()) return 0;
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (i == s.length() - 1 || (!(s.charAt(i + 1) >= '0') && s.charAt(i + 1) <= '9')) return 0;
            if (s.charAt(i) == '-') sign = -1;
            i++;
        } else {
            if (!(s.charAt(i) <= '9' && s.charAt(i) >= '0')) return 0;
        }
        while (i < s.length() && s.charAt(i) == '0') i++;
        if (i == s.length() && s.charAt(i - 1) == '0') return 0;
        int j = i;
        if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) return 0;
        while (j < s.length() && (s.charAt(j) >= '0' && s.charAt(j) <= '9')) j++;
        long val = 0;
        if (j - i > 12) {
            if (sign == 1) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        if (j >= s.length()) val = Long.parseLong(s.substring(i));
        else {
            // System.out.println(s.substring(i));
            // System.out.println(i);
            // System.out.println(j);
            val = Long.parseLong(s.substring(i, j));
        }
        if (val * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (val * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return sign * (int) val;
    }

}

