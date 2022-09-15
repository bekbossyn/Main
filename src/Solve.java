import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solve {

    public void solve(char[][] b) {
        int n = b.length;
        int m = b[0].length;
        HashMap<String, Boolean> h = new HashMap<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (b[i][j] == 'O' && (i - 1 < 0 || b[i - 1][j] == 'X') && (j - 1 < 0 || b[i][j - 1] == 'X') &&
                        (i + 1 == n || b[i + 1][j] == 'X') && (j + 1 == m || b[i][j + 1] == 'X')) {
                    h.put(i + "," + j, true);

                } else {
                    b[i][j] = 'X';
                }
        for (int i = 0; i <n;i++)
            for (int j = 0; j < m;j++)
                if (!h.containsKey(i+","+j)) b[i][j] = 'X';
    }

}
