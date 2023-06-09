import java.util.HashMap;
import java.util.HashSet;

public class FreqAlphabets {

    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        HashMap<String, Character> hashMap = new HashMap<>();
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            i++;
            String ss = "";
            if (i < 10) {
                ss = Integer.toString(i);
            } else {
                ss = i + "#";
            }
            hashMap.put(ss, c);
        }
        while (s.length() > 0) {
            i = 26;
            while (i > 0) {
                String ss = "";
                if (i > 9) {
                    ss = i + "#";
                } else {
                    ss = Integer.toString(i);
                }
                if (s.contains(ss) && s.indexOf(ss) == 0) {
                    result.append(hashMap.get(ss));
                    s = s.substring(ss.length());
                    break;
                } else i--;
            }

        }
        return result.toString();
    }

}
