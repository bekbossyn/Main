import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;
        int[] ar1 = new int[arr.length];
        for (int i = 0; i < ar1.length; i++) ar1[i] = arr[i];
        Arrays.sort(ar1);
        int rank = 1;
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(ar1[0], rank);
        for (int i = 1; i < ar1.length; i++) {
            if (ar1[i] != ar1[i - 1]) {
                h.put(ar1[i], ++rank);
            }
        }
        for (int i = 0; i < arr.length; i++) arr[i] = h.get(arr[i]);
        return arr;
    }

}
