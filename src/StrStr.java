public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++)
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                while (true) {
                    j++;
                    if (j == needle.length()) return i;
                    if (needle.charAt(j) != haystack.charAt(i + j)) break;
                }
            }
        return -1;
    }

}
