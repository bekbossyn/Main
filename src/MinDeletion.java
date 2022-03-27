import java.util.LinkedList;
import java.util.Queue;

public class MinDeletion {

    public int minDeletion(int[] ns) {
        Queue<Integer> qs = new LinkedList<>();
        for (int n : ns) qs.add(n);
        int cnt = 0;
        while (true) {
            if (qs.isEmpty()) break;
            int n1 = qs.remove();
            if (qs.isEmpty()) {
                cnt++;
                break;
            }
            int n2 = qs.remove();
            while (n2 == n1 && !qs.isEmpty()) {
                n2 = qs.remove();
                cnt++;
            }
            if (qs.isEmpty()){
                if (n2 == n1) {
                    cnt+=2;
                    break;
                }
                break;
            }
        }
        return cnt;
    }

}
