public class MergeAlternately {

    public String mergeAlternately(String word1, String word2) {
        int maximus = Math.min(word1.length(), word2.length());
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < maximus; i++) {
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            s.append(word1.substring(maximus));
        } else {
            s.append(word2.substring(maximus));
        }
        return s.toString();
    }

}
