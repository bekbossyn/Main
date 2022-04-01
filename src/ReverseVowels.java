import java.util.Arrays;

public class ReverseVowels {

    public String reverseVowels(String s) {
        String vowels = "aioueAIOUE";
        char[] ss = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !vowels.contains(ss[i] + "")) i++;
            while (i < j && !vowels.contains(ss[j] + "")) j--;
            char ch = ss[i];
            ss[i] = ss[j];
            ss[j] = ch;
            i++;
            j--;
        }
        return String.valueOf(ss);
    }
}