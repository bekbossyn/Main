public class ReverseStr {

    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            rev(str, i, Math.min(i + k, str.length) - 1);
        }
        return String.valueOf(str);
    }

    void rev(char[] s, int l, int r) {
        while (l < r) {
            char t = s[l];
            s[l++] = s[r];
            s[r--] = t;
        }
    }

}
