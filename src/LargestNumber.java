import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] ns) {
        String[] strings = new String[ns.length];
        int len = 0;
        for (int n : ns) strings[len++] = String.valueOf(n);
        strings = sort(strings);
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) sb.append(strings[i]);
        if (zero(sb.toString())) return "0";
        return sb.toString();
    }

    private boolean zero(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != '0') return false;
        return true;
    }

    private String[] sort(String[] strings) {
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++)
            for (int j = 1; j < strings.length; j++) {
                String s1 = strings[j - 1] + strings[j];
                String s2 = strings[j] + strings[j - 1];
                if (s1.compareTo(s2) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j - 1];
                    strings[j - 1] = temp;
                }
            }
        return strings;
    }

}
