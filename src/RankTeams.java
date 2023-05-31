import java.util.Arrays;
import java.util.HashMap;

public class RankTeams {

    class Pair {
        int[] used;
        int strength;
        char c;

        Pair(char c, int index) {
            this.used = new int[26];
            this.used[index] = 1;
            this.strength = 26 - c + 'A';
            this.c = c;
        }

        public static int compare(Pair p1, Pair p2) {
            int[] u1 = p1.used;
            int[] u2 = p2.used;
            int index = 0;
            while (index < p1.used.length && u1[index] == u2[index]) {
                index++;
            }
            // totally equal
            if (index == p1.used.length) {
                return p2.strength - p1.strength;
            } else {
                return u2[index] - u1[index];
            }
        }
    }

    public String rankTeams(String[] vs) {
        HashMap<Character, Integer> map = new HashMap<>();
        Pair[] pairs = new Pair[vs[0].length()];
        for (int i = 0; i < vs[0].length(); i++) {
            pairs[i] = new Pair(vs[0].charAt(i), i);
            map.put(vs[0].charAt(i), i);
        }
        for (int j = 1; j < vs.length; j++) {
            for (int i = 0; i < vs[j].length(); i++) {
                int index = map.get(vs[j].charAt(i));
                pairs[index].used[i]++;
            }
        }
        Arrays.sort(pairs, Pair::compare);
        StringBuilder result = new StringBuilder();
        for (Pair pair : pairs) {
            result.append(pair.c);
        }
        return result.toString();
    }

}
