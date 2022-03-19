public class GetLucky {
    public int getLucky(String s, int k) {
        int len = s.length();
        byte[] ch = new byte[len];

        for (int i = 0; i < s.length(); i++)
            ch[i] = (byte) (s.charAt(i) - 96);
        int sum = 0;
        for (int j = 0; j < len; j++) {
            while (ch[j] > 0) {
                sum += ch[j] % 10;
                ch[j] /= 10;
            }
        }
        for (int i = 1; i < k; i++) {
            int ss = 0;
            while (sum > 0) {
                ss += sum % 10;
                sum /= 10;
            }
            sum = ss;
        }
        return sum;
    }
}
