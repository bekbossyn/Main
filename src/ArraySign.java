public class ArraySign {

    public int arraySign(int[] ns) {
        int sign = 1;
        for (int n : ns) {
            if (n < 0) sign *= -1;
            else if (n == 0) return 0;
        }
        return sign;
    }

}
