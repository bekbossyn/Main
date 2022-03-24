import java.util.HashMap;

public class CheckIfExist {

    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) h.put(arr[i], i);
        for (int i = 0; i < arr.length; i++)
            if (h.containsKey(arr[i] * 2) && h.get(arr[i] * 2) != i)
                return true;
        return false;
    }
}
