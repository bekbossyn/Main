import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SumFourDivisors {

    static class Number {
        int number;
        int sum;
        int count;

        Number(int n) {
            this.number = n;
            this.count = 0;
            this.sum = sum(1, n);

        }

        private int sum(int i, int n) {
            if (n == 1) {
                count = 1;
                return 1;
            }
            if (i > Math.sqrt(n)) return 0;
            if (n % i == 0) {
                count += 2;
//                int s = 0;
                if (i == n / i) count--;
                return i + n / i + sum(i + 1, n);
            }
            return sum(i + 1, n);
        }

        public String toString() {
            return "number: " + this.number + " Sum: " + this.sum + " Count: " + this.count;
        }
    }

    public int sumFourDivisors(int[] ns) {
        int len = ns.length;
        int sum = 0;
        HashMap<Integer, Number> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!hashMap.containsKey(ns[i])) {
//                Number num = new Number(ns[i]);
                hashMap.put(ns[i], new Number(ns[i]));
            }
            Number num =hashMap.get(ns[i]);
            if (num.count==4) sum += num.sum;

        }

//        for (int i = 0; i < len; i++) {
//            System.out.println(numbers[i]);
//        }
//        System.out.println(Arrays.toString(numbers));
        return sum;
    }

}
