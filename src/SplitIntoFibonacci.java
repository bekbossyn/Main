import java.util.ArrayList;
import java.util.List;

public class SplitIntoFibonacci {

    public List<Integer> splitIntoFibonacci(String n) {
        List<Integer> result = new ArrayList<>();
        boolean found = false;
        for (int i = 1; i <= n.length() / 2; i++) {
            for (int j = i + 1; j <= n.length() - i; j++)
                if (!found) {
                    String n1 = n.substring(0, i);
                    String n2 = n.substring(i, j);
                    if (!invalid(n1) && !invalid(n2) && n.substring(j).length() != 0) {
                        result.add(Integer.valueOf(n1));
                        result.add(Integer.valueOf(n2));
                        if (check(n1, n2, n.substring(j), result)) {
                            found = true;
                            break;
                        }
                        result.remove(result.size() - 1);
                        result.remove(result.size() - 1);
                    }

                }
        }
        return result;
    }

    private boolean check(String n1, String n2, String n, List<Integer> result) {
        if (n.length() == 0) return true;
        for (int i = Math.max(n1.length(), n2.length()); i <= Math.min(n.length(), n1.length() + n2.length()); i++) {
            String n3 = n.substring(0, i);
            if (n3.length() == 0) return true;
            String temp = sum(n1, n2);
            if (!invalid(n3) &&
                    sum(n1, n2).equals(n3)) {
                result.add(Integer.valueOf(n3));
                if (check(n2, n3, n.substring(n3.length()), result)) return true;
                result.remove(result.size() - 1);
            }
        }
        return false;
    }

    private String sum(String num1, String num2) {
        StringBuilder n1 = new StringBuilder(num1);
        StringBuilder n2 = new StringBuilder(num2);
        n1.reverse();
        n2.reverse();
        int maxLength = Math.max(num1.length(), num2.length());
        while (n1.length() < maxLength) n1.append('0');
        while (n2.length() < maxLength) n2.append('0');
        StringBuilder n3 = new StringBuilder();
        int rem = 0;
        for (int i = 0; i < maxLength; i++) {
            rem += (int) n1.charAt(i) - '0' + (int) n2.charAt(i) - '0';
            n3.append(rem % 10);
            rem /= 10;
        }
        if (rem > 0) n3.append(rem);
        return n3.reverse().toString();
    }

    private boolean invalid(String number) {
        String m = "2147483647";
        long m1 = 2147483647;
        if (number.length() > m.length()) return true;
        if (number.length() < 1) return true;
        if (number.length() > 1 && number.charAt(0) == '0') return true;
        if (number.length() == m.length()) {
            long nn = Long.parseLong(number);
            return nn > m1;
        }
        return false;
    }

}
