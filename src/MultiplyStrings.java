class MultiplyStrings {
    public String multiply(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        // 00123 -> 32100
        int maxLength = Math.max(num1.length(), num2.length());
        while (num1.length() < maxLength)   num1 = num1 + "0";
        while (num2.length() < maxLength)   num2 = num2 + "0";

        byte[] num1Byte = num1.getBytes();
        for (int i = 0; i < maxLength; i++) num1Byte[i] -= 48;
        byte[] num2Byte = num2.getBytes();
        for (int i = 0; i < maxLength; i++) num2Byte[i] -= 48;

        byte [] num3Byte = new byte[maxLength * 2];

        String num3 = "";
        int rem = 0;
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j <maxLength; j++)  {
                rem = num1Byte[i] * num2Byte[j];
                byte k = 0;
                while (rem > 0) {
                    rem += num3Byte[i + j + k];
                    num3Byte[i + j + k] = (byte) (rem % 10);
                    rem /= 10;
                    k++;
                }
            }
        }
        int mexx = maxLength * 2 - 1;
        while (num3Byte[mexx] == 0 && mexx > 0) mexx--;
        for (int i = mexx; i >= 0; i--)    {
//            num3Byte[i] += 48;
            num3 = num3 + num3Byte[i];
        }
        return num3;
    }
}
