import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramMappings {

    public int[] anagramMappings(int[] ns1, int[] ns2) {
        int[] res = new int[ns2.length];
        for (int i = 0; i < ns1.length; i++) {
            for (int j = 0; j < ns2.length; j++) {
                if (ns1[i] == ns2[j]) {
                    res[i] = j;
                    ns2[j] = -1;
                }
            }
        }
        return res;
    }

}
