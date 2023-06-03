public class MinimizeResult {

    public String minimizeResult(String expr) {
        // a * (b + c) * d
        int min = Integer.MAX_VALUE;
        String result = "";
        int point = expr.indexOf("+");
        for (int i = 0; i < point; i++) {
            for (int j = point + 1; j < expr.length(); j++) {
                StringBuilder totalSb = new StringBuilder();
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < i; k++) {
                    sb.append(expr.charAt(k));
                    totalSb.append(expr.charAt(k));
                }
                // a
                int number1 = 1;
                if (sb.length() > 0) {
                    number1 = Integer.parseInt(sb.toString());
                }
                totalSb.append("(");
                sb = new StringBuilder();
                for (int k = i; k < point; k++) {
                    sb.append(expr.charAt(k));
                    totalSb.append(expr.charAt(k));
                }
                // b
                totalSb.append("+");
                int number2 = Integer.parseInt(sb.toString());
                sb = new StringBuilder();
                for (int k = point + 1; k <= j; k++) {
                    sb.append(expr.charAt(k));
                    totalSb.append(expr.charAt(k));
                }
                // c
                int number3 = Integer.parseInt(sb.toString());
                sb = new StringBuilder();
                totalSb.append(")");
                for (int k = j+1; k < expr.length(); k++) {
                    sb.append(expr.charAt(k));
                    totalSb.append(expr.charAt(k));
                }
                // d
                int number4 = 1;
                if (sb.length() > 0) {
                    number4 = Integer.parseInt(sb.toString());
                }
                int res = number1 * (number2 + number3) * number4;
                if (res < min) {
                    min = res;
                    result = totalSb.toString();
                }
            }
        }
        return result;
    }

}
