public class FrequencySort {

    public int[] frequencySort(int[] ns) {
        int[] news = new int[ns.length];
        int ind = 0;
        int[] ds = new int[201];
        for (int n : ns) ds[n + 100]++;
        for (int cnt = 0; cnt <=100; cnt++) {
            for (int i = 100; i >= -100; i--) {
                if (ds[i + 100] == cnt) {
                    for (int k = 0; k < cnt; k++) {
                        news[ind++] = i;
                    }
                }
            }
        }
        return news;
    }

}
