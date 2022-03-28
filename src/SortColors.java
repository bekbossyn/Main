public class SortColors {

    public void sortColors(int[] ns) {
        int[] cnt = new int[3];
        for (int n : ns) {
            cnt[n]++;
        }
        int i = 0;
        while (i != ns.length) {
            for (int j = 0; j < cnt[0]; j++) ns[i++] = 0;
            for (int j = 0; j < cnt[1]; j++) ns[i++] = 1;
            for (int j = 0; j < cnt[2]; j++) ns[i++] = 2;
        }
    }

}
