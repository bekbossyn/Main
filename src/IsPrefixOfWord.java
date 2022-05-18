public class IsPrefixOfWord {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] ws = sentence.split(" ");
        int i = 0;
        for (String w : ws) {
            i++;
            if (w.startsWith(searchWord)) return i;
        }
        return -1;
    }

}
