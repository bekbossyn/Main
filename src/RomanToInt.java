public class RomanToInt {

    public int romanToInt(String s) {
        if (s.length() == 0) return 0;
        int total = 0;
        String[] ss = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] ns = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int i = 12;
        while (s.indexOf(ss[i]) != 0) i--;
//        if (!(i + 1 >= ns.length)) {
//            if (s.indexOf(ss[i + 1]) == 0) i++;
//        }
        s = s.substring(ss[i].length());
        return ns[i] + romanToInt(s);
    }

}
