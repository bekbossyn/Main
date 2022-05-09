public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] ns) {
        int max = 0;
        int cnt = 0;
        int prev = 0;
        for (int i = 0; i < ns.length; i++) {
            if (ns[i] == 1 && prev == 1) {
                cnt++;
            } else {
                cnt = 0;
                prev = ns[i];
                if (prev == 1) cnt++;
            }
            max = Math.max(cnt, max);
        }
        return max;
    }

}
