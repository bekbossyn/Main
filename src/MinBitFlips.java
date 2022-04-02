public class MinBitFlips {

    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
        String ss = Integer.toBinaryString(goal);
        int max = Math.max(s.length(), ss.length());
        while (s.length() < max) s = "0" + s;
        while (ss.length() < max) ss = "0" + ss;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ss.charAt(i)) cnt++;
        }
        return cnt;
    }

}
