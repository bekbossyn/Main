import java.util.Arrays;

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

    public int searchII(int[] ns, int t) {
        int j = 0;
        while (j < ns.length - 1 && ns[j] < ns[j + 1]) j++;
        j++;
        int[] nn = new int[ns.length];
        int ind = 0;
        for (int i = j; i < ns.length; i++) nn[ind++] = ns[i];
        for (int i = 0; i < j; i++) nn[ind++] = ns[i];
        int l = 0, r = ns.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nn[mid] < t) l = mid + 1;
            else r = mid;
        }
        for (int i = 0; i < nn.length; i++) if (ns[i] == t) ind = i;
        if (l < nn.length && nn[l] == t) return ind;
        return -1;
    }

    public boolean searchIII(int[] ns, int t) {
        int j = 0;
        while (j < ns.length - 1 && ns[j] <= ns[j + 1]) j++;
        j++;
        int[] nn = new int[ns.length];
        int ind = 0;
        for (int i = j; i < ns.length; i++) nn[ind++] = ns[i];
        for (int i = 0; i < j; i++) nn[ind++] = ns[i];
        int l = 0, r = ns.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nn[mid] < t) l = mid + 1;
            else r = mid;
        }
        System.out.println(Arrays.toString(nn));
        // for (int i = 0; i < nn.length; i++) if (ns[i] == t) ind = i;
        return l < nn.length && nn[l] == t;
        // if (nn[l] == t) return true;
    }

}
