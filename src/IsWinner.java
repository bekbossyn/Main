public class IsWinner {

    public int isWinner(int[] p1, int[] p2) {
        int len = p1.length;

        int sum1 = p1[0], sum2 = p2[0];
        for (int i = 1; i < len; i++) {
            if (p1[i - 1] == 10 || (i - 2 >= 0 && p1[i - 2] == 10)) sum1 += p1[i] * 2;
            else sum1 += p1[i];
            if (p2[i - 1] == 10 || (i - 2 >= 0 && p2[i - 2] == 10)) sum2 += p2[i] * 2;
            else sum2 += p2[i];
        }
        System.out.println(sum1+ " " + sum2);
        if (sum1 == sum2) return 0;
        if (sum1 > sum2) return 1;
        return 2;
    }

}
