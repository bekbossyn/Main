import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequent {

    public int[] topKFrequent(int[] ns, int k) {
        HashMap<Integer, List<Integer>> quantityMap = new HashMap<>();
        int difference = 10000;
        int[] counter = new int[difference * 2 + 1];
        for (int n : ns) {
            counter[n+difference]++;
        }
        for (int i = -difference; i <= difference; i++) {
            if (counter[i + difference] > 0) {
                List<Integer> list = quantityMap.getOrDefault(counter[i + difference], new ArrayList<>());
                list.add(i);
                quantityMap.put(counter[i + difference], list);
            }
//            quantityMap.put(i, quantityMap.getOrDefault(i, 0) + 1);
        }
        int[] answer = new int[k];
        int index = 0;
        for (int i = 100000; i > 0 && index < k; i--) {
            if (quantityMap.containsKey(i)) {
                List<Integer> list = quantityMap.get(i);
                for (int j = 0; j < list.size(); j++)
                    answer[index++] = list.get(j);
            }
        }
        return answer;
    }

}
