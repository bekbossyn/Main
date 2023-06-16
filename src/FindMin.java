public class FindMin {

    public int findMin(int[] ns) {
        int len = ns.length;
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (ns[mid] > ns[r])
                l = mid + 1;
            else if (ns[mid] == ns[r])
                r = r - 1;
            else
                r = mid;
        }
        return ns[r];
    }

    public int findMin1(int[] ns) {
        int len = ns.length;
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (ns[mid] > ns[r])
                l = mid + 1;
            else
                r = mid;
        }
        return ns[r];
    }

}
