import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int k = i;
            String ks = String.valueOf(k);
            boolean self = true;
            for (int j = 0; j < ks.length(); j++) {
                if (ks.charAt(j) - 48 == 0 || i % (ks.charAt(j) - 48) != 0) {
                    self = false;
                    break;
                }
            }
            if (self) l.add(i);
        }
        return l;
    }

}
