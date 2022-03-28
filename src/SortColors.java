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

    /*
    public void sortColors(int[] ns) {
        int[] cnt = new int[3];
        int len = ns.length;
        for (int n : ns) {
            cnt[n]++;
        }
        if (cnt[0] != len) {
            int pos0 = 0;
            int posN = 0;
            while (cnt[0] > 0) {
                while (ns[pos0] != 0) pos0++;
                while (ns[posN] == 0) posN++;
                cnt[0]--;
                if (pos0 > posN) {
                    int t = ns[pos0];
                    ns[pos0] = ns[posN];
                    ns[posN] = t;
                } else {
                    pos0++;
                }
            }
        }
        if (cnt[1] != len) {
            int pos1 = 0;
            int pos2 = 0;
            while (cnt[1] > 0) {
                while (ns[pos1] != 1) pos1++;
                while (pos2 < len && ns[pos2] != 2) pos2++;
                if (pos2 == len) break;
                cnt[1]--;
                if (pos1 > pos2) {
                    int t = ns[pos1];
                    ns[pos1] = ns[pos2];
                    ns[pos2] = t;
                } else{
                    pos1++;
                }
            }
        }
    }
     */

}
