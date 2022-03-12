import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> myList = new ArrayList<Integer>();
        int rem = k;
        for (int i = num.length - 1; i >= 0; i--)   {
            rem += num[i];
            myList.add(rem % 10);
            rem /= 10;
        }
        while (rem > 0) {
            myList.add(rem % 10);
            rem /= 10;
        }
        Collections.reverse(myList);
        return myList;
    }
}
