import java.util.ArrayList;
import java.util.List;

public class Combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combineHelper(0, k - 1, 0, n, result, new ArrayList<>());
        return result;
    }

    void combineHelper(int currentIndex, int maxIndex, int currentN, int maxN, List<List<Integer>> result, List<Integer> currentList) {
        if (currentIndex > maxIndex) {
            // copy of current List
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = currentN + 1; i <= maxN; i++) {
            currentList.add(i);
            combineHelper(currentIndex + 1, maxIndex, i, maxN, result, currentList);
            currentList.remove(currentList.size() - 1);
        }

    }

}
