import java.util.*;

public class FindLeastNumOfUniqueInts {

    int lastIndex;

    class Number {
        int num;
        int count;
        int index;

        Number(int number) {
            this.num = number;
            this.count = 1;
            this.index = lastIndex++;
        }

        public void inc() {
            this.count++;
        }

        public String toString() {

            return "[" + this.index + " " + this.num + " " + this.count + "]";
        }

        public static int compare(Number n1, Number n2) {
            return n2.count - n1.count;
        }
    }

    public int findLeastNumOfUniqueInts(int[] ns, int k) {
        List<Number> numbers = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : ns) {
            if (map.containsKey(n)) {
                Number number = numbers.get(map.get(n));
                number.inc();
            } else {
                Number number = new Number(n);
                numbers.add(number);
                map.put(n, numbers.size() - 1);
            }
        }
        numbers.sort(Number::compare);
//        System.out.println(numbers);
        int size = numbers.size() - 1;
        while (size >= 0 && k > 0) {
            k -= numbers.get(size).count;
            if (k >= 0)
                size--;
        }
        return size + 1;
    }

}
