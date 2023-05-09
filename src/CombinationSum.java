import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        rec(target, 0, candidates, 0, new ArrayList<>(), result);

        return result;
    }

    void rec(int totalSum, int currentSum, int[] numbers, int currentCountOfNumbers, List<Integer> currentList, List<List<Integer>> result) {
        if (currentSum > totalSum) return;
        if (currentSum == totalSum) {
            // error, list is just a pointer, so we need to create new List
//            result.add(currentList);
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = currentCountOfNumbers; i < numbers.length; i++) {
            if (totalSum < currentSum+i) continue;
            currentList.add(numbers[i]);
            rec(totalSum, currentSum + numbers[i], numbers, i, currentList, result);
            currentList.remove(currentList.size() - 1);
        }
    }

}
