public class RemovePalindromeSub {

    public int removePalindromeSub(String s) {
        if (s.length() == 0) return 0;
        for (int i = 0; i < (s.length() + 1) / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return 2;
        return 1;
    }

}
