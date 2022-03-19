public class HappyNumber {

    public boolean isHappyHelper(int n, int[] sums)   {
        if (n == 1) return true;
        int sum = 0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++)  {
            sum += (num.charAt(i) - 48) * (num.charAt(i) - 48);
        }
        for (int i = 0; i < sums.length; i++)
            if (sum == sums[i])
                return false;
        int sums2[] = new int[sums.length + 1];
        for (int i = 0; i < sums.length; i++)
            sums2[i] = sums[i];
        sums2[sums.length] = sum;
        return isHappyHelper(sum, sums2);
    }

    public boolean isHappy(int n) {
        return isHappyHelper(n, new int[]{0});
    }

}
