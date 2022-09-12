import java.util.Arrays;

public class DigitCount {

    public boolean digitCount(String num) {
        int[] digits = new int[10];
        for (int i = 0; i < 10; i++) digits[i] = 0;
        for (int i = 0; i < num.length(); i++) {
            digits[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < num.length(); i++) {
            if (digits[i] != num.charAt(i) - '0') return false;
        }
        return true;
    }

}
