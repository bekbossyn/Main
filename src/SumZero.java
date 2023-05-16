/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      22:07:10
*/


import java.util.ArrayList;
import java.util.List;

public class SumZero {

    public int[] sumZero(int n) {
        List<Integer> list = new ArrayList<>();
        if (n % 2 == 1) {
            list.add(0);
            n--;
        }
        int m = 1;
        for (int i = 0; i < n / 2; i++) {
            list.add(m * (-1));
            list.add(m++);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}
