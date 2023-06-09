public class SumOfThree {

    public long[] sumOfThree(long num) {
        long res = num / 3;
        if (res * 3 != num) return new long[]{};
        long[] result = new long[3];
        result[0] = res - 1;
        result[1] = res;
        result[2] = res + 1;
        return result;
    }

}
