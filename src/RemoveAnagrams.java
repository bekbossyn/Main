import java.util.*;

public class RemoveAnagrams {

    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>(Arrays.asList(words));

        while (true) {
            boolean found = false;
            if (result.size() <= 1) break;
            for (int i = 1; i < result.size(); i++) {
                if (anagrams(result.get(i - 1), result.get(i))) {
                    result.remove(i);
                    found = true;
                    break;
                }
            }
            if (!found) break;
        }
        return result;
    }

    boolean anagrams(String a, String b) {
        HashMap<Character, Integer> ha = new HashMap<>();
        HashMap<Character, Integer> hb = new HashMap<>();
        for (char c : a.toCharArray()) ha.put(c, ha.getOrDefault(c, 0) + 1);
        for (char c : b.toCharArray()) hb.put(c, hb.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> entry : ha.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (hb.containsKey(key)) {
                if (!Objects.equals(hb.get(key), value)) {
                    return false;
                }
            } else return false;
        }
        return ha.size() == hb.size();
    }

}
