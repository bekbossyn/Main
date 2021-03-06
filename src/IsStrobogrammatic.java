import java.util.HashMap;

public class IsStrobogrammatic {

    public boolean isStrobogrammatic(String num) {
        StringBuilder rotated = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c == '1' || c == '8' || c == '0') rotated.append(c);
            else if (c == '6') rotated.append('9');
            else if (c == '9') rotated.append('6');
            else return false;
        }
        return rotated.toString().equals(num);
    }

}
