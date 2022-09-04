public class ArithmeticTriplets {

    public int arithmeticTriplets(int[] ns, int d) {
        int cnt = 0;
        for (int i = 0; i < ns.length - 2; i++)
            for (int j = i + 1; j < ns.length - 1; j++)
                for (int k = j + 1; k < ns.length; k++) {
                    if (ns[j] - ns[i] == d && ns[k] - ns[j] == d) cnt++;
                }
        return cnt;
    }

}
