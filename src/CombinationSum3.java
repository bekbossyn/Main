import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> finalList = new ArrayList<>();

        if (n < k || n > 55) return finalList;

        cSum(1, k, 0, n, new ArrayList<>(), finalList);

        return finalList;
    }

    void cSum(int lastNumber, int numberCount, int remainingSum, int sum, List<Integer> currentList, List<List<Integer>> finalList) {
        if (currentList.size() == numberCount && remainingSum == sum) {
            finalList.add(new ArrayList<>(currentList));
            return;
        }
        if (currentList.size() > numberCount) return;
//        if (remainingSum > n) return;
        for (int i = lastNumber; i < 10; i++) {
            currentList.add(i); //  Adding number
            cSum(i + 1, numberCount, remainingSum + i, sum, currentList, finalList);
            currentList.remove(currentList.size() - 1); //  Removing Number
        }
    }

}
