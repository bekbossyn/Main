class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String s1 = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                char c = s.charAt(i);
                s1 = s1 + c;
            }
        }
        for (int i = 0; i < s1.length() / 2; i++)  {
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}