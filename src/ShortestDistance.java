public class ShortestDistance {

    public int shortestDistance(String[] ws, String w1, String w2) {
        int pos1 = -1, pos2 = -1;
        int min = ws.length;
        for (int i = 0; i < ws.length; i++) {
            if (ws[i].equals(w1)) pos1 = i;
            if (ws[i].equals(w2)) pos2 = i;
            if (pos1 != -1 && pos2 != -1) min = Math.min(min, Math.abs(pos1 - pos2));

        }
        return min;
    }

}
