class AddStrings {
    public String addStrings(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int maxLength = Math.max(num1.length(), num2.length());
        while (num1.length() < maxLength)   num1 = num1 + "0";
        while (num2.length() < maxLength)   num2 = num2 + "0";
        int rem = 0;
        String result = "";
        for (int i = 0; i < maxLength; i++) {
            rem += num1.charAt(i) - '0' + num2.charAt(i) - '0';
            result = rem % 10 + result;
            rem /= 10;
        }
        if (rem > 0)    {
            result = rem + result;
        }
        return result;
    }
}
