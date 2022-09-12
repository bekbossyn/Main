public class MagicalString {

    public int magicalString(int n) {
        StringBuilder s = new StringBuilder("122");
        for (int i = 2; i < n; i++) {
            int nn = s.charAt(i) - '0';
            if (s.charAt(s.length() - 1) == '2') {
                s.append("1".repeat(Math.max(0, nn)));
            } else {
                s.append("2".repeat(Math.max(0, nn)));
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '1') cnt++;
        return cnt;
    }

}
