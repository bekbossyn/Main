public class SumOfDigits {

    public int sumOfDigits(int[] ns) {
        int min = ns[0];
        for (int n : ns)
            if (min > n) min = n;
        int sum = 0;
        while (min > 0) {
            sum += min % 10;
            min /= 10;
        }
        return (sum + 1) % 2;
    }

}
