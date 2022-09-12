public class ShortestToChar {

    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] b = new int[len];
        int lastLeft = -1;
        for (int i = 0; i < len; i++) b[i] = 10001;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c) {
                b[i] = 0;
                lastLeft = i;
//                if (lastRight == -1) lastRight = i;
            } else {
                int min = i - lastLeft;
                if (lastLeft == -1) min = 10001;
                int ind = i + 1;
                while (ind < len && s.charAt(ind) != c) ind++;
                if (ind != len) min = Math.min(min, ind - i);
                b[i] = min;
            }
        }
        return b;
    }

}
