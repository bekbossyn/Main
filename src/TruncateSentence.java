public class TruncateSentence {

    public String truncateSentence(String s, int k) {
        String[] ws = s.split(" ");
        StringBuilder w = new StringBuilder();
        for (int i = 0; i < k - 1; i++) {
            w.append(ws[i]).append(" ");
        }
        w.append(ws[k - 1]);
        return w.toString();
    }

}
