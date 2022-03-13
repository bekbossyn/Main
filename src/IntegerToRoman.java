class IntegerToRoman {
    public String intToRoman(int num) {
        int[] ints = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        int ind = 0;
        while (num > 0) {
            if (num >= ints[ind])   {
                num -= ints[ind];
                result += str[ind];
            } else {
                ind++;
            }
        }
        return result;
    }
}
