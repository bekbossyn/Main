import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] ns, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ns.length; i++) {
            if (hashMap.containsKey(target - ns[i])) {
                return new int[]{hashMap.get(target - ns[i]) + 1, i + 1};
            } else {
                hashMap.put(ns[i], i);
            }
        }
        return new int[]{};
    }

}
