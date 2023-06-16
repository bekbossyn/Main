public class ReverseBits {

    public int reverseBits(int n) {
        int num = 0, pow = 0;

        while (n != 0) {

            if ((n & 1) == 1) {
                num += Math.pow(2, pow);
            }
            pow++;
            n >>>= 1;
        }
        return num;
    }

}
