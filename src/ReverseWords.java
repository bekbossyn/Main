public class ReverseWords {

    public String reverseWords(String s) {
        String[] ws = s.split("\\s+");
        StringBuilder sss = new StringBuilder();
        for (String w : ws) {
            StringBuilder ss = new StringBuilder(w);
//            ws[i] = ss.reverse().toString();
            sss.append(ss.reverse().toString()).append(" ");
        }
        return sss.substring(0, sss.length() - 1);
    }

    void rev(char[] s, int l, int r) {
        while (l < r) {
            char c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }

}
