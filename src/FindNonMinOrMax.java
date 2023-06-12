public class FindNonMinOrMax {

    public int findNonMinOrMax(int[] ns) {
        int min = ns[0], max = ns[0];
        for (int i = 1; i < ns.length; i++) {
            max = Math.max(max, ns[i]);
            min = Math.min(min, ns[i]);
        }
        for (int n : ns) {
            if (n != min && n != max) return n;
        }
        return -1;
    }

}
