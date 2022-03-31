public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            boolean is = isBadVersion(mid);
            if (is) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

    boolean isBadVersion(int num) {
        return true;
    }

}
