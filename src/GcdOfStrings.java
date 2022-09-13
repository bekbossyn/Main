public class GcdOfStrings {

    public String gcdOfStrings(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int minL = Math.max(s1.length(), s2.length());
        int low = gcd(l1, l2) + 1;
        while (low > 0) {
            low--;
            if (low == 0) return "";
            if (l1 % low != 0 || l2 % low != 0) continue;
            String ss = s1.substring(0, low);
            if (check(s1, ss) && check(s2, ss)) return s1.substring(0, low);
        }
        return "";
    }

    boolean check(String s, String ss) {
        StringBuilder s2 = new StringBuilder(ss);
        StringBuilder s3 = new StringBuilder(ss);
        while (s.length() > s3.length()) {
            s3.append(s2);
        }
        return s.equals(s3.toString());
    }

    int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}
