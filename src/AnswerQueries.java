import java.util.Arrays;

public class AnswerQueries {

    public int[] answerQueries(int[] ns, int[] qs) {
        int[] res = new int[qs.length];
        Arrays.sort(ns);
        int[] b = new int[ns.length];
        b[0] = ns[0];
        for (int i = 1; i < ns.length; i++) b[i] = b[i - 1] + ns[i];
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(qs));
        for (int i = 0; i < qs.length; i++) {
            int j = 0;
            while (j < ns.length && b[j] <= qs[i]) j++;
            res[i] = j;
        }
        return res;
    }

}
