import java.util.HashMap;

public class SortSentence {

    public String sortSentence(String s) {
        String[] words = s.split("\\s+");
        HashMap<Integer, String> h = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            h.put(Integer.parseInt(String.valueOf(words[i].charAt(words[i].length() - 1))), words[i].substring(0, words[i].length() - 1));
        }
        StringBuilder ss = new StringBuilder();
        for (int i = 1; i <= words.length; i++) {
            ss.append(h.get(i)).append(" ");
        }
        ss.delete(ss.length() - 1, ss.length());
        return ss.toString();
    }

}
