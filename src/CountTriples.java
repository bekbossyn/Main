public class CountTriples {

    public int countTriples(int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++)
            for (int j = i; j < n; j++) {
                for (int k = j + 1; k <= n; k++)
                    if (i * i + j * j == k * k) {
                        cnt+=2;
                    }
            }
        return cnt;
    }

}
