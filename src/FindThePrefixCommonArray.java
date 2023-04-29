public class FindThePrefixCommonArray {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int[] C = new int[len];
        for (int i = 0; i < len; i++) {
            int cnt = 0;
            for (int j = 0; j <= i; j++)
                for (int k = 0; k <= i; k++)
                    if (A[j] == B[k]) {
                        cnt++;
                        break;
                    }
            C[i] = cnt;
        }
        return C;
    }

}
