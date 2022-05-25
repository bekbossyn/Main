import java.util.HashMap;

public class CountVowelSubstrings {

    boolean vowelsTest(String s) {
        int cnt = 0;
        String t = "aeiou";
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) h.put(c, h.getOrDefault(c, 0) + 1);
        int total = 0;
        for (char c : t.toCharArray()) total += h.getOrDefault(c, 0);
        if (total != s.length()) return false;
        for (char c : t.toCharArray()) {
            if (s.indexOf(c) >= 0) cnt++;
            else return false;
        }
        return cnt == 5;
    }

    public int countVowelSubstrings(String word) {
        int cnt = 0;
        for (int i = 0; i < word.length() - 4; i++) {
            for (int j = i + 5; j < word.length(); j++)
                if (vowelsTest(word.substring(i, j))) cnt++;
        }
        return cnt;
    }

}
