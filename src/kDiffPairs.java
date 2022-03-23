import java.util.HashMap;
import java.util.Hashtable;

public class kDiffPairs {

    public int findPairs(int[] ns, int k) {
        HashMap<String, Boolean> hMap = new HashMap<String, Boolean>();
        int count = 0;
        for (int i = 0; i < ns.length - 1; i++)
            for (int j = i + 1; j < ns.length; j++)
                if (Math.abs(ns[i] - ns[j]) == k) {
                    String key = "";
                    if (ns[i] > ns[j]) {
                        key = String.valueOf(ns[j]) + "#" + String.valueOf(ns[i]);
                    } else {
                        key = String.valueOf(ns[i]) + "#" + String.valueOf(ns[j]);
                    }
                    if (!hMap.containsKey(key))
                        count++;
                    hMap.put(key, true);
//                    System.out.println(i + " " + j);
                }
        return count;
    }

}
