public class FindNumbers {

    public int findNumbers(int[] ns) {
        int cnt = 0;
        for (int n : ns) {
            int curCnt = 0;
            while (n > 0) {
                curCnt++;
                n /= 10;
            }
            if (curCnt % 2 == 0) cnt++;
        }
        return cnt;
    }

}
