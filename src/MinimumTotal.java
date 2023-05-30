import java.util.Arrays;
import java.util.List;

public class MinimumTotal {

    public int minimumTotal(List<List<Integer>> ts) {
        int len = ts.size();
        for (int i = 1; i < ts.size(); i++) {
            for (int j = 0; j < ts.get(i).size(); j++) {
                if (j == 0) ts.get(i).set(j, ts.get(i).get(j) + ts.get(i - 1).get(j));
                else if (j == ts.get(i).size() - 1) {
                    ts.get(i).set(j, ts.get(i).get(j) + ts.get(i - 1).get(j - 1));
                } else {
                    ts.get(i).set(j, ts.get(i).get(j) + Math.min(ts.get(i - 1).get(j - 1), ts.get(i - 1).get(j)));
                }
            }
        }
        int min = ts.get(ts.size() - 1).get(0);
        for (int i = 1; i < ts.get(ts.size() - 1).size(); i++)
            min = Math.min(min, ts.get(ts.size() - 1).get(i));
        return min;
    }

}
