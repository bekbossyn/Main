class AddBinary {
    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int maxLength = Math.max(a.length(), b.length());
        while (a.length() < maxLength)  {
            a = a + '0';
        }
        while (b.length() < maxLength)  {
            b = b + '0';
        }
        String result = "";
        int rem = 0;
        for (int i = 0; i < maxLength; i++)    {
            rem += a.charAt(i) - '0' + b.charAt(i) - '0';
            if (rem == 0)   {
                result = result + "0";
            } else if (rem == 1)    {
                result = result + "1";
                rem = 0;
            } else if (rem == 2)    {
                rem = 1;
                result = result + "0";
            } else if (rem == 3)    {
                rem = 1;
                result = result + "1";
            }
        }
        if (rem > 0)    {
            result += "1";
        }
        return new StringBuilder(result).reverse().toString();
    }
}
