import java.util.HashMap;

public class MaxPower {

    public int maxPower(String s) {
        int max = 1;
        int Max = 1;
        String ss = s.charAt(0) + "";
        char prev = '!';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                max = max + 1;
            } else {
                max = 1;
            }
            prev = s.charAt(i);
            if (max > Max) Max = max;
        }
        return Max;
    }

}
