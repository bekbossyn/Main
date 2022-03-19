import java.util.Arrays;
import java.util.HashMap;

public class NthUglyNumber {

    public int nthUglyNumber(int n) {
        HashMap<Long, Boolean> numbers = new HashMap<Long, Boolean>();
        int constant = 2123366400;
        int constCount = 1690;
        long[] arr = new long[1690];
        //  2123366400
        int cnt = 1;
        arr[0] = 1;
        numbers.put((long) 1, true);
        int i = 0;
        while (cnt < constCount) {
            long num = arr[i] * 2;
            if (!numbers.containsKey(num) && num <= constant) {
                arr[cnt++] = num;
                numbers.put(num, true);
            }
            num = arr[i] * 3;
            if (!numbers.containsKey(num) && num <= constant) {
                arr[cnt++] = num;
                numbers.put(num, true);
            }
            num = arr[i] * 5;
            if (!numbers.containsKey(num) && num <= constant) {
                arr[cnt++] = num;
                numbers.put(num, true);
            }
            i++;
        }
        Arrays.sort(arr);
        return (int) arr[n - 1];
    }

    /*

    time limit

    public int nthUglyNumber(int n) {
        int i = 0;
        int cnt = 0;
        while (cnt < n) {
            if (isUgly(++i))
                cnt++;
        }
        return i;
    }

     */

}
