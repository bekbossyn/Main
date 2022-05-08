public class CountQuadruplets {

    public int countQuadruplets(int[] ns) {
        int cnt = 0;
        for (int i = 0; i < ns.length - 3; i++)
            for (int j = i + 1; j < ns.length - 2; j++)
                for (int k = j + 1; k < ns.length - 1; k++)
                    for (int l = k + 1; l < ns.length; l++)
                        if (ns[i] + ns[j] + ns[k] == ns[l]) cnt++;
        return cnt;
    }

}
