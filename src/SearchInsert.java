public class SearchInsert {

    public int searchInsert(int[] ns, int t) {
        int l = 0, r = ns.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (ns[mid] == t) return mid;
            else if (ns[mid] > t) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

}
