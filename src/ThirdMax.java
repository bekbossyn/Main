import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdMax {

    public int thirdMax(int[] ns) {
        List<Integer> ms = new ArrayList<>();
        ms.add(ns[0]);
        for (int i = 1; i < ns.length; i++) {
            if (ms.size() < 3 || ns[i] > ms.get(0)) {
                boolean same = false;
                for (int j = 0; j < ms.size(); j++) {
                    if (ms.get(j) == ns[i]) same = true;
                }
                if (same) continue;
                if (ms.size() < 3) {
                    ms.add(ns[i]);
                    Collections.sort(ms);
                    continue;
                }
                ms.add(ns[i]);
                Collections.sort(ms);
                ms.set(0, ms.get(ms.size() - 1));
                ms.remove(ms.size() - 1);
                Collections.sort(ms);
            }
        }
        System.out.println(ms);
        if (ms.size() < 3) return ms.get(ms.size() - 1);
        return ms.get(0);
    }

}
