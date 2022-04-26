public class CanBeTypedWords {

    public int canBeTypedWords(String t, String ls) {
        String[] words = t.split("\\s+");
        int cnt = words.length;
        for (int i = 0; i < words.length; i++)
            for (char c : ls.toCharArray()){
                if (words[i].contains(c+"")){
                    cnt--;
                    break;
                }
            }
        return cnt;
    }

}
