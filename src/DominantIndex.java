public class DominantIndex {

    public int dominantIndex(int[] ns) {
        int maximus = -1;
        int maxIndex = -1;
        for (int i = 0; i < ns.length; i++)
            if (ns[i] > maximus) {
                maximus = ns[i];
                maxIndex = i;
            }
        if (maxIndex != -1)
            for (int i = 0; i < ns.length; i++)
                if (maxIndex != i && ns[i] * 2 > maximus) {
                    return -1;
                }
        return maxIndex;
    }

}
