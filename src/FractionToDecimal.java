import java.util.HashMap;
import java.util.HashSet;

public class FractionToDecimal {

    public String fractionToDecimal(int num, int den) {
        long numerator = num;
        long denominator = den;
        StringBuilder answer = new StringBuilder();
        if ((numerator % denominator) == 0) {
            return String.valueOf(numerator / denominator);
        }
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) answer.append('-');
        if (numerator < 0) numerator = -numerator;
        if (denominator < 0) denominator = -denominator;
        answer.append(numerator / denominator);
        answer.append('.');
        long rem = numerator % denominator;
        HashMap<Long, Integer> map = new HashMap<>();
        while (rem != 0) {
            if (map.containsKey(rem)) {
                int pos = map.get(rem);
                answer.insert(pos, '(');
                answer.append(')');
                break;
            }
            map.put(rem, answer.length());
            rem *= 10;
            long res = rem / denominator;
            rem %= denominator;
            answer.append(res);
        }
        return answer.toString();
    }

}
