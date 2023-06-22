import java.util.Arrays;

public class CountSegments {

    public int countSegments(String s) {
//        if (s.length() == 0) return 0;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i == s.length()) return 0;
        s = s.substring(i);
        int count = s.split("\\s+").length;

        System.out.println(Arrays.toString(s.split("\\s+")));
        return count;
    }

}
