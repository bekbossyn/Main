import java.util.HashMap;

public class TitleToNumber {

    public int titleToNumber(String s) {
        StringBuilder cs = new StringBuilder(s).reverse();
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < 26; i++)
            h.put((char) ('A' + i), i + 1);
        int num = 1;
        int res = 0;
        for (int i = 0; i < cs.length(); i++) {
            res += num * h.get(cs.charAt(i));
            num *= 26;
        }
        return res;
    }

}
