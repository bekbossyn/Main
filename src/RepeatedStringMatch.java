public class RepeatedStringMatch {

    public int repeatedStringMatch(String a, String b) {
        int ind = b.length() / a.length();
        StringBuilder s = new StringBuilder();

        int cnt = 0;
        for (int i = 0; i < ind + 2; i++) {
            if (s.toString().contains(b))
                return cnt;
            s.append(a);
            cnt++;
        }
        return -1;
    }

}
