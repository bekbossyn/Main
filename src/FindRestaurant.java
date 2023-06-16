import java.util.HashMap;

public class FindRestaurant {

    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = list1.length + list2.length + 1;
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int i = map.get(list2[j]);
                if (min > i + j) {
                    min = i + j;
                    count = 1;
                } else if (min == i + j) {
                    count++;
                }
            }
        }
        String[] result = new String[count];
        count = 0;
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j]) && map.get(list2[j]) + j == min)
                result[count++] = list2[j];
        }
        return result;
    }

}
