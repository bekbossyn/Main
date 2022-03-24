import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {

    public List<Integer> findDuplicates(int[] ns) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        List<Integer> nl = new ArrayList<>();
        for (int i = 0; i < ns.length; i++){
            if (h.containsKey(ns[i])){
//                ns[count++]= ns[i];
                nl.add(ns[i]);
            } else {
                h.put(ns[i], true);
            }
        }
        return nl;
    }

}
