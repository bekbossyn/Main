public class CountSubstrings {

    public int countSubstrings(String s) {
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (palindrome(new StringBuilder(s.substring(i, j)))) cnt++;
            }
        }
        return cnt;
    }

    boolean palindrome(StringBuilder s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
