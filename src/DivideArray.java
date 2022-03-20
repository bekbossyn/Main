public class DivideArray {

    public boolean divideArray(int[] ns) {
        int[] digits = new int[501];
        for (int n : ns) digits[n]++;
        for (int digit : digits) if (digit % 2 == 1) return false;
        return true;
    }

}
