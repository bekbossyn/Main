import java.util.Locale;

public class HalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String vowels = "aeiou";
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < (s.length() + 1) / 2; i++) {
            if (vowels.contains(s.charAt(i) + "")) cnt1++;
        }
        for (int i = (s.length() + 1) / 2; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i) + "")) cnt2++;
        }
        return cnt1 == cnt2;
    }

}
