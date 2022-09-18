class Trie {
    Trie []ch = new Trie[26];
    int cnt = 0;
}

public class SumPrefixScores {

    public int[] sumPrefixScores(String[] ws) {
        Trie trie = new Trie();
        int len = ws.length;
        int[] sum = new int [len];

        for (String w : ws ) {
            Trie t = trie;
            for (char v : w.toCharArray()){
                int c = v-'a';
                if (t.ch[c]==null) t.ch[c] = new Trie();
                t.ch[c].cnt++;
                t = t.ch[c];
            }
        }
        int index = 0;
        for (String w:ws) {
            Trie t = trie;
            int total = 0;
            for (char v : w.toCharArray()) {
                int c = v-'a';
                total+=t.ch[c].cnt;
                t = t.ch[c];
            }
            sum[index++] = total;
        }

        return sum;
    }

}
