public class ReversePrefix {

    public String reversePrefix(String word, char ch) {
        int i = 0;
        while (i < word.length() && word.charAt(i) != ch) i++;
        if (i >= word.length()) return word;
        int q = 0;
        StringBuilder s = new StringBuilder(word.substring(0, i + 1));
        s = s.reverse();
        return s.toString() + word.substring(i + 1);
    }

}
