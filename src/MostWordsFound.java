public class MostWordsFound {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String w : sentences) {
            String[] ws = w.split(" ");
            max = Math.max(max, ws.length);
        }
        return max;
    }

}
