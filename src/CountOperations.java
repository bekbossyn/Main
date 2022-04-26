public class CountOperations {

    public int countOperations(int n1, int n2) {
        int cnt = 0;
        while (!(n1 == 0 || n2 == 0)) {
            if (n2 > n1) n2 -= n1;
            else n1 -= n2;
            cnt++;
        }
        return cnt;
    }

}
