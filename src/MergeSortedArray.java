import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] ns, int n, int[] ms, int m) {
        int in = 0;
        int im = 0;
        int[] nms = new int[n + m];
        int cnt = 0;
        while (!(in >= n && im >= m)) {
            if (in >= n) {
                nms[cnt++] = ms[im++];
            } else if (im >= m) {
                nms[cnt++] = ns[in++];
            } else {
                if (ns[in] > ms[im]) {
                    nms[cnt++] = ms[im++];
                } else {
                    nms[cnt++] = ns[in++];
                }
            }
        }
        for (int i = 0; i < n + m; i++) {
            ns[i] = nms[i];
        }
//        System.out.println(Arrays.toString(ns));
    }

}
