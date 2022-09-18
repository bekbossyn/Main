import java.util.Arrays;
import java.util.HashMap;

public class SumPrefixScores {

    class Trie {
        Trie[] ch = new Trie[26];
        int count = 0;
    }

    public int[] sumPrefixScores(String[] ws) {
        Trie trie = new Trie();
        int len = ws.length;
        int[] sum = new int[len];
        int k = 0;
        for (String w : ws) {
            Trie t = trie;
            for (char c : w.toCharArray()) {
                int v = c - 'a';
                if (t.ch[v] == null) t.ch[v] = new Trie();
                t.ch[v].count++;
                t = t.ch[v];
            }
        }

        for (String w : ws) {
            Trie t = trie;
            int total = 0;
            for (char c : w.toCharArray()) {
                int v = c - 'a';
                total += t.ch[v].count;
                t = t.ch[v];
            }
            sum[k++] = total;
        }

        return sum;
    }


}
