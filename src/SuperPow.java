public class SuperPow {

    //  euler theorem --> 1140
    public int superPow(int a, int[] b) {
        int power = 0;
        for (int i : b) power = (power * 10 + i) % 1140;
        a %= 1337;
        int result = 1;
        while (power > 0) {
            if (power % 2 == 1)
                result = result * a % 1337;
            a = a * a % 1337;
            power /= 2;
        }
        return result;
    }

}
