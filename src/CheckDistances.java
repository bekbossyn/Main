public class CheckDistances {

    public boolean checkDistances(String s, int[] d) {
        int[] used = new int[26];
        int[] pos = new int[26];
        int i = -1;
        for (char c : s.toCharArray()) {
            i++;
            if (used[c - 'a'] == 0) {
                used[c - 'a'] = 1;
                pos[c - 'a'] = i;
            } else if (used[c - 'a'] == 1) {
                used[c-'a'] = 2;
                if (!(i - pos[c - 'a'] == d[c - 'a'] + 1)) return false;
            }
        }
        return true;
    }

}
