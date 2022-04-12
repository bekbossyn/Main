import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] hs) {
        int[] es = new int[hs.length];
        for (int i = 0; i < es.length; i++) es[i] = hs[i];
        Arrays.sort(es);
        int cnt = 0;
        for (int i = 0; i < hs.length; i++)
            if (es[i] != hs[i]) cnt++;
        return cnt;
    }

}
