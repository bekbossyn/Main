class IntegerToEnglishWords {
    public String numberToWords(int num) {

        final String[] Ones = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine"};
        final String[] Tens = new String[]{"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                "Eighty", "Ninety"};
        final String[] Special = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"};// len 10; [0->9]

        String str = "";

        if (num < 1000) {
            if (num == 0) {
                str = "";
            } else {
                int hundreds = num / 100;
                //          817
                int tens = (num % 100) / 10;
                int ones = num % 10;
                boolean special = false;
                if (num % 100 < 20 && num % 100 > 9) special = true;
                if (hundreds > 0) {
                    //  Three Hundred
                    str += Ones[hundreds] + " Hundred ";
                }
                if (special) {
                    str += Special[num % 10] + " ";
                } else {
                    if (tens > 0) {
                        str += Tens[tens] + " ";
                    }
                    if (ones > 0) {
                        str += Ones[ones] + " ";
                    }
                }
            }
        } else {
            //  2.123.456.789
            int billions = num / 1000000000;
            int millions = num % 1000000000 / 1000000;
            int thousands = num % 1000000 / 1000;
            int hundreds = num % 1000;

            if (billions > 0) {
                String s1 = numberToWords(billions);
                if (!s1.contains("Zero"))
                    str += s1 + " Billion ";
            }
            if (millions > 0) {
                String s1 = numberToWords(millions);
                if (!s1.contains("Zero"))
                    str += s1 + " Million ";
            }
            if (thousands > 0)  {
                String s1 = numberToWords(thousands);
                if (!s1.contains("Zero"))
                    str += s1 + " Thousand ";
            }
            String s1 = numberToWords(hundreds);
            if (!s1.contains("Zero"))
                str += s1;
        }
        if (str.length() < 3) str = "Zero";
        if (str.length() > 3) {
            if (str.charAt(str.length() - 1) == ' ') {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}
