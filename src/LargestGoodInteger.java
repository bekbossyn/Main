public class LargestGoodInteger {

    public String largestGoodInteger(String n) {
        int max = -1;
        for (int i = 0; i < n.length() - 2; i++) {
            if (n.charAt(i) == n.charAt(i + 1) && n.charAt(i) == n.charAt(i + 2)) {
                int i1 = (n.charAt(i) - '0') * 100 + (n.charAt(i + 1) - '0') * 10 + (n.charAt(i) - '0');
                if (max < i1)
                    max = i1;
            }
        }
        if (max == -1) return "";
        if (max == 0) return "000";
        return String.valueOf(max);
    }

}
