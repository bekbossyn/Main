public class CountKDifference {

    public int countKDifference(int[] ns, int k) {
        int cnt = 0;
        for (int i = 0; i < ns.length - 1; i++)
            for (int j = i + 1; j < ns.length; j++)
                if (Math.abs(ns[i] - ns[j]) == k) cnt++;
        return cnt;
    }

}
