public class IsAdditiveNumber {

    public boolean isAdditiveNumber(String n) {
        for (int i = 1; i <= n.length() / 2; i++) {
            for (int j = i + 1; j <= n.length()-i; j++) {
                String n1 = n.substring(0, i);
                String n2 = n.substring(i, j);
                if (!invalid(n1) && !invalid(n2) && n.substring(j).length() != 0) {
                    if (check(n1, n2, n.substring(j)))
                        return true;
                }

            }
        }
        return false;
    }

    private boolean check(String n1, String n2, String n) {
        if (n.length() == 0) return true;
        for (int i = Math.max(n1.length(), n2.length()); i <= Math.min(n.length(), n1.length() + n2.length()); i++) {
            String n3 = n.substring(0, i);
            if (n3.length() == 0) return true;
            String temp = sum(n1, n2);
            if (!invalid(n3) &&
                    sum(n1, n2).equals(n3)) {
                return check(n2, n3, n.substring(n3.length()));
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
//        char rem = '0';
        int rem = 0;
        for (int i = 0; i < maxLength; i++) {
//            rem += (n1.charAt(i) - '0') + (n2.charAt(i) - '0');
            rem += (int) n1.charAt(i) - '0' + (int) n2.charAt(i) - '0';
//            rem -= '0';
            n3.append(String.valueOf(rem % 10));
            rem /= 10;
        }
        if (rem > 0) n3.append(String.valueOf(rem));
        return n3.reverse().toString();
    }

    private boolean invalid(String number) {
        if (number.length() < 1) return true;
        if (number.length() > 1 && number.charAt(0) == '0') return true;
        return false;
    }

}
