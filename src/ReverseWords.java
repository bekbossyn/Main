import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        s = s.substring(i);
        int j = s.length() - 1;
        while (j > 0 && s.charAt(j) == ' ') j--;
        s = s.substring(0, j + 1);
        String[] ws = s.split("\\s+");
        Collections.reverse(Arrays.asList(ws));
        // System.out.println(s);
        // System.out.println(Arrays.toString(ws));
        for (String w : ws) {
            result.append(w);
            result.append(' ');
        }
        result = new StringBuilder(result.substring(0, result.length() - 1));
        return result.toString();
    }

    public String reverseWords1(String s) {
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
