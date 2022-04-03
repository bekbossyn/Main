import java.util.*;

public class FindWinners {

    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> h = new HashMap<>();
        HashMap<Integer, Integer> losers = new HashMap<>();
        int max = 0;
        boolean[] used = new boolean[matches.length];
        for (int[] m : matches) {
            int wins = h.getOrDefault(m[0], 0);
            int loses = losers.getOrDefault(m[1], 0);
            h.put(m[0], wins + 1);
            losers.put(m[1], loses - 1);
            max = Math.max(Math.max(m[0], m[1]), max);
        }
        System.out.println(h);
        System.out.println(losers);
        List winList = new ArrayList<>();
        List weakWinList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if (h.getOrDefault(i, 0) > 0 && losers.getOrDefault(i, 1) > 0) winList.add(i);
            else if (losers.getOrDefault(i, 0) == -1) weakWinList.add(i);
        }

        List<List<Integer>> newList = new ArrayList<>();
        newList.add(winList);
        newList.add(weakWinList);
        return newList;
    }
}
