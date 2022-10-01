public class EqualFrequency {

    public boolean equalFrequency(String w) {
        int[] c = new int[26];
        boolean found = false;
        for (int i = 0; i < w.length(); i++) {
            for (int j = 0; j < 26; j++) c[j] = 0;
            for (int ii = 0; ii < w.length(); ii++) {
                if (ii != i)
                    c[w.charAt(ii) - 'a']++;
            }
            int max = -1;
            found = true;
            for (int j = 0; j < 26; j++)
                if (c[j] != 0)
                    if (max == -1) {
                        max = c[j];
                    } else if (max != c[j]) found = false;
            if (found) return true;
        }
        return false;
    }

}
