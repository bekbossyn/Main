public class Search {

    public int search(int[] ns, int t) {
        int l = 0, r = ns.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (ns[mid] < t) l = mid + 1;
            else r = mid;
        }
        if (l < ns.length && ns[l] == t) return l;
        return -1;
    }

}
