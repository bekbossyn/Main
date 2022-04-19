public class SearchRange {

    public int[] searchRange(int[] ns, int t) {
        int first = -1, last = -1;
        for (int i = 0; i < ns.length; i++) {
            if (ns[i] == t) {
                if (first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }

}
