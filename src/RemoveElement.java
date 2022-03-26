public class RemoveElement {

    public int removeElement(int[] ns, int val) {
        if (ns.length == 0) return 0;
        int k = ns.length - 1;
        int cnt = 0;
        int i = 0;
        while (i < k) {
            while (i < ns.length && ns[i] != val) i++;
            while (ns[k] == val && k > 0) k--;
            if (i > k) break;
            int temp = ns[i];
            ns[i] = ns[k];
            ns[k] = temp;
        }
        k = ns.length - 1;
        while (k > 0 && ns[k] == val) k--;
        return k + 1;
    }

}
