import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class NumberOfPairs {

    long binarySearch(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (list.get(mid) <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public long numberOfPairs(int[] ns1, int[] ns2, int diff) {
        int len = ns1.length;
        long cnt = 0;
        for (int i = 0; i < len; i++) {
            ns1[i] = ns1[i] - ns2[i];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            cnt += binarySearch(list, ns1[i] + diff);
            int index = (int) binarySearch(list, ns1[i]);
            list.add(index, ns1[i]);
        }
        return cnt;
    }

}
