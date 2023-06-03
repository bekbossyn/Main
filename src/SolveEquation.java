import java.util.Arrays;

public class SolveEquation {

    static class Pair {
        boolean x;
        int number;

        Pair(boolean x, int number) {
            this.x = x;
            this.number = number;
        }

        Pair(int number) {
            this.x = false;
            this.number = number;
        }
    }

    public String solveEquation(String equation) {
        if (equation.charAt(0) != '-') {
            equation = "+" + equation;
        }
        StringBuilder s = new StringBuilder();
        boolean found = false;
        for (int i = 0; i < equation.length(); i++) {
            if (found) {
                if (equation.charAt(i) == '+') {
                    s.append(" -");
                } else if (equation.charAt(i) == '-') {
                    s.append(" +");
                } else {
                    s.append(equation.charAt(i));
                }
            } else {
                if (equation.charAt(i) == '+' || equation.charAt(i) == '-') {
                    if (i != 0) {
                        s.append(" ");
                    }
                    s.append(equation.charAt(i));
                } else if (equation.charAt(i) != '=') {
                    s.append(equation.charAt(i));
                }
                if (equation.charAt(i) == '=') {
                    found = true;
//                    s.append(" ");
                    if (equation.charAt(i + 1) != '-') {
                        s.append(" -");
                    }

                }
            }
        }
        equation = s.toString();
        System.out.println(equation);
        String[] tokens = equation.split(" ");
        System.out.println(Arrays.toString(tokens));
        int sum = 0;
        int xSum = 0;
        for (int i = 0; i < tokens.length; i++) {
            Pair number = getNumber(tokens[i]);
            if (number.x) {
                xSum += number.number;
            } else {
                sum += number.number;
            }
        }
        if (xSum == 0) {
            if (sum == 0)
                return "Infinite solutions";
            return "No solution";
        }
        return "x=" + (sum*(-1) / xSum);
//        return "";
    }

    Pair getNumber(String s) {
        boolean x = s.contains("x");
        int sign = 1;
        if (s.charAt(0) == '-') sign = -1;
        if (x) s = s.substring(1, s.length() - 1);
        else s = s.substring(1);

        int number = (s.length() > 0) ? (Integer.parseInt(s)) : (1);
        return new Pair(x, sign * number);
    }

}
