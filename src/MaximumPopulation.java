public class MaximumPopulation {

    public int maximumPopulation(int[][] logs) {
        int[] cnt = new int[2051];
        for (int[] l : logs) {
            for (int i = l[0]; i < l[1]; i++) cnt[i]++;
        }
        int max = 0;
        int year = 0;
        for (int i = 1950; i < 2051; i++)
            if (max < cnt[i]) {
                max = cnt[i];
                year = i;
            }
        return year;
    }

}
