/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      00:44:26
                00:54:00
*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LetterCasePermutation {

    static HashSet<String> h = new HashSet<>();

    public List<String> letterCasePermutation(String s) {
        h = new HashSet<>();
        helper(s, 0);
        return new ArrayList<>(h);
    }

    void helper(String s, int pos) {

        if (pos >= s.length()) {
            h.add(s);
            return;
        }
        char c = Character.toLowerCase(s.charAt(pos));
        if (c >= 'a' && c <= 'z') {
            char[] chars = s.toCharArray();
            chars[pos] = c;
            helper(String.valueOf(chars), pos + 1);
            chars[pos] = Character.toUpperCase(c);
            helper(String.valueOf(chars), pos + 1);
        } else {
            helper(s, pos + 1);
        }

    }

}
