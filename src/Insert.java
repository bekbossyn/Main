import java.util.ArrayList;
import java.util.List;

public class Insert {

    public int[][] insert(int[][] ints, int[] nInt) {
        int len = ints.length;
        int indFirst = 0;
        int indLast = len - 1;
        if (len == 0) return new int[][]{nInt};
        List<int[]> l = new ArrayList<>();
        int[] middle = new int[2];
        // first element
        if (ints[0][0] > nInt[1]) {
            l.add(nInt);
            for (int[] i : ints) {
                l.add(i);
            }
            return l.toArray(new int[0][]);
        }
        //last element
        if (ints[len - 1][1] < nInt[0]) {
            for (int[] i : ints) {
                l.add(i);
            }
            l.add(nInt);
            return l.toArray(new int[0][]);
        }
        // middle
        do {
            if (indFirst >= len) break;
            if (ints[indFirst][0] > nInt[0]) {
                if (indFirst > 0 && ints[indFirst - 1][1] >= nInt[0])
                    indFirst--;
                break;
            }
            indFirst++;
        }
        while (true);

        do {
            if (indLast < 0) break;
            if (ints[indLast][1] < nInt[1]) {
                if (indLast < len - 1 && ints[indLast + 1][0] <= nInt[1])
                    indLast++;
                break;
            }
            indLast--;
        } while (true);


        if (indFirst >= len) indFirst = len - 1;
        if (indLast < 0) indLast = 0;

        middle[0] = Math.min(nInt[0], ints[indFirst][0]);
        middle[1] = Math.max(nInt[1], ints[indLast][1]);

        for (int i = 0; i < indFirst; i++) l.add(ints[i]);

        l.add(middle);

        for (int i = indLast + 1; i < len; i++) l.add(ints[i]);

        return l.toArray(new int[0][]);
    }

}
