public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;
        while (i > 0 && s.charAt(i) == ' ') i--;
        for (int j = i; j >= 0; j--) {
            if (s.charAt(j) != ' ') len++;
            else {
                return len;
            }
        }
        return len;
    }

}
