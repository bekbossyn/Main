import java.util.Arrays;

public class MinimumSum {

    public int minimumSum(int num) {
        int[] ar = new int[4];
        ar[0] = num / 1000;
        ar[1] = num % 1000 / 100;
        ar[2] = num % 100 / 10;
        ar[3] = num % 10;
        Arrays.sort(ar);
        int sum = 9999;
        sum = Math.min(sum, (ar[0] + ar[1]) * 10 + ar[2] + ar[3]);
        sum = Math.min(sum, (ar[0] + ar[2]) * 10 + ar[1] + ar[3]);
        sum = Math.min(sum, (ar[0] + ar[3]) * 10 + ar[1] + ar[2]);
        sum = Math.min(sum, (ar[1] + ar[3]) * 10 + ar[0] + ar[2]);
        sum = Math.min(sum, (ar[2] + ar[3]) * 10 + ar[0] + ar[1]);
        return sum;
    }

}
