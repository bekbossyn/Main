import java.util.HashSet;

public class CheckValid {

    public boolean checkValid(int[][] m) {
        HashSet<String> h = new HashSet<>();
        for (int i = 0 ; i < m.length; i++)
            for (int j = 0 ; j < m.length; j++)
                if (!h.add(m[i][j] + " row " + i) || ! h.add(m[i][j] + " col " + j)) return false;
        return true;
    }

}
