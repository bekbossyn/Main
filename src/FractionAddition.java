import java.util.Arrays;

public class FractionAddition {

    class Number {
        int numerator;
        int denominator;
        int sign;

        Number(int sign, int numerator, int denominator) {
            this.sign = sign;
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public String fractionAddition(String expr) {
        StringBuilder sb = new StringBuilder();
        if (expr.charAt(0) != '-') expr = "+" + expr;
        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '-' || expr.charAt(i) == '+') {
                if (i != 0) sb.append(" ");
            }
            sb.append(expr.charAt(i));
        }
        expr = sb.toString();
        String[] tokens = expr.split(" ");
        System.out.println(Arrays.toString(tokens));
        Number number1 = getNumber(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            Number number2 = getNumber(tokens[i]);
            number1 = add(number1, number2);
        }
        return number1.sign * number1.numerator + "/" + number1.denominator;
    }

    Number add(Number n1, Number n2) {
        int numerator, denominator, sign = 1;
        if (n1.denominator != n2.denominator) {
            denominator = lcd(n1.denominator, n2.denominator);
            //  2/3 1/6
            n1.numerator *= denominator * 1.0 / n1.denominator;
            n2.numerator *= denominator * 1.0 / n2.denominator;

        } else denominator = n1.denominator;
        numerator = n1.sign * n1.numerator + n2.sign * n2.numerator;
        if (numerator < 0) {
            sign = -1;
            numerator = -numerator;
        }
        int common = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= common;
        denominator /= common;
        return new Number(sign, numerator, denominator);
    }

    // Least Common Denominator
    int lcd(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    //  Greatest Common Factor
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    Number getNumber(String s) {
        int sign = 1;
        if (s.charAt(0) == '-') sign = -1;
        s = s.substring(1);
        int divide = s.indexOf("/");
        int numerator = Integer.parseInt(s.substring(0, divide));
        int denominator = Integer.parseInt(s.substring(divide + 1));
        return new Number(sign, numerator, denominator);
    }

}
