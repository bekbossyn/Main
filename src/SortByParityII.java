public class SortByParityII {

    public int[] sortArrayByParityII(int[] ns) {
        int i = 0;
        int j = 1;
        int n = ns.length;
        while (i < n && j < n) {
            if (ns[i] % 2 == 0)
                i += 2;
            else if (ns[j] % 2 == 1)
                j += 2;
            else {
                int t = ns[i];
                ns[i] = ns[j];
                ns[j] = t;
            }
        }
        return ns;
    }

}
