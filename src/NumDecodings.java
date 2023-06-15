public class NumDecodings {

    public int numDecodings(String s) {
        int len = s.length();
        int[] b = new int[len + 1];
        b[len] = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                b[i] = b[i + 1];
                if (i != len - 1) {
                    if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
                        b[i] += b[i + 2];
                    }
                }
            }
        }
        return b[0];
    }

}
