import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {

    public List<Integer> minSubsequence(int[] ns) {
        Arrays.sort(ns);
        int sum2 = 0;
        int sum1= 0;
        for (int i = 0; i < ns.length;i++) sum2+= ns[i];
        List<Integer> l = new ArrayList<>();
        int ind = ns.length;
        while (sum1 <= sum2){
            ind--;
            sum1+=ns[ind];
            sum2-=ns[ind];
            l.add(ns[ind]);
        }
        return l;
    }

}
