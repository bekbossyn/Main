public class PivotIndex {

    public int pivotIndex(int[] ns) {
        int sum = 0, total = 0;
        for (int i : ns) sum += i;
        total = sum;
        sum = 0;
        for (int i = 0; i < ns.length; i++) {
            total -= ns[i];
            if (i > 0) sum += ns[i - 1];
            if (total == sum) return i;
        }
        return -1;
    }

}
