public class FindPeakElement {

    //  O(n)
    public int findPeakElement(int[] ns) {
        for (int i = 0; i < ns.length - 1; i++) {
            if (ns[i] > ns[i + 1]) {
                return i;
            }
        }
        return ns.length - 1;
    }

}
