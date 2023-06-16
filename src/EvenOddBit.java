public class EvenOddBit {

    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        int[] b = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') b[(s.length() - i + 1) % 2]++;
        }
        return b;
    }

}
