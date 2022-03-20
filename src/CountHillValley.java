public class CountHillValley {

    public int countHillValley(int[] ns) {
        int cnt = 0;
        for (int i = 1; i < ns.length - 1; i++) {
            int l = -1;
            int lNum = 0;
            int r = -1;
            int rNum = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (ns[j] != ns[i]) {
                    lNum = ns[j];
                    l = j;
                    break;
                }
            }
            for (int j = i + 1; j < ns.length; j++) {
                if (ns[j] != ns[i]) {
                    rNum = ns[j];
                    r = j;
                    break;
                }
            }
            if (r != -1 && l != -1) {
                if (ns[i] > lNum && ns[i] > rNum) cnt++;
                if (ns[i] < lNum && ns[i] < rNum) cnt++;
                i = r - 1;
            }
        }
        return cnt;
    }

}
