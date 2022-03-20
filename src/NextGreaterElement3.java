
public class NextGreaterElement3 {

    public int nextGreaterElement(int n) {
        String numStr = String.valueOf(n);
        long result = 2147483648L;

        StringBuilder cp = new StringBuilder(numStr);

        int i = cp.length();
        while (i > 1) {
            i--;
            int j = i - 1;
            while (j >= 0) {
                StringBuilder cp1 = new StringBuilder(numStr);
                cp1.setCharAt(i, cp.charAt(j));
                cp1.setCharAt(j, cp.charAt(i));
                long newNum = Long.parseLong(cp1.toString());
                if (newNum > n) {
                    int[] digits = new int[10];
                    for (int k = j + 1; k < cp.length(); k++)
                        digits[cp1.charAt(k) - 48]++;
                    int pos = j + 1;
                    for (int k = 0; k < 10; k++)
                        for (int kk = 0; kk < digits[k]; kk++) {
                            cp1.setCharAt(pos, (char) (k + 48));
                            pos++;
                        }
                    newNum = Long.parseLong(cp1.toString());
                    if (newNum <= 2147483647) {
                        if (result > newNum) result = newNum;
                    }
                }
                j--;
            }
        }
        if (result == 2147483648L)
            result = -1;
        return (int) result;
    }
}
