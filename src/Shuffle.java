import java.util.ArrayList;
import java.util.List;

public class Shuffle {

    public int[] shuffle(int[] ns, int n) {
        int[] result = new int[n * 2];
        for (int i = 0; i < n; i++) {
            result[i * 2] = ns[i];
            result[2 * i + 1] = ns[n + i];
        }
        return result;
    }

}
