import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

    public int[] findEvenNumbers(int[] digits) {
        List<Integer> resultList = new ArrayList<>();
        boolean[] used = new boolean[10];
        int[] cnt = new int[10];
        for (int d : digits) {
            used[d] = true;
            cnt[d]++;
        }
        System.out.println(Arrays.toString(cnt));
        for (int i = 1; i < 10; i++)
            if (used[i]) {
                for (int j = 0; j < 10; j++)
                    if (used[j]) {
                        if (i == j && cnt[i] < 2) continue;
                        for (int k = 0; k < 10; k += 2)
                            if (used[k]) {
                                if (i == k && i == j && cnt[i] < 3) continue;
                                if (i == k && cnt[i] < 2) continue;
                                if (j == k && cnt[j] < 2) continue;
                                // if (i == k && cnt[i] < 2 && i != j) continue;
                                // if (j == k && cnt[j] < 2 && i != k) continue;
                                resultList.add(i * 100 + j * 10 + k);
                            }
                    }
            }
        return resultList.stream().mapToInt(i->i).toArray();
    }

}
