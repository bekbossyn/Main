import java.util.PriorityQueue;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int i = 0, j = 0, len1 = n1.length, len2 = n2.length, size = len1 + len2;
        double result = 0;

        if (size % 2 == 0) {
            // even
            if (len1 == 0) return (n2[len2 / 2] + n2[len2 / 2 - 1]) / 2.0;
            if (len2 == 0) return (n1[len1 / 2] + n1[len1 / 2 - 1]) / 2.0;
            int lastI = 0, lastJ = 0, count = 0, mid = size / 2;
            while (i + j <= mid) {
                if (i >= len1) {
                    lastJ = n2[j];
                    j++;
                    count++;
                    if (count == mid) {
                        result = lastJ;
                    } else if (count - 1 == mid) {
                        result = (result + lastJ) / 2;
                    }
                } else if (j >= len2) {
                    lastI = n1[i];
                    i++;
                    count++;
                    if (count == mid) {
                        result = lastI;
                    } else if (count - 1 == mid) {
                        return (result + lastI) / 2.0;
                    }
                } else {
                    if (n1[i] <= n2[j]) {
                        lastI = n1[i];
                        i++;
                        count++;
                        if (count == mid) {
                            result = lastI;
                        } else if (count - 1 == mid) {
                            return (result + lastI) / 2.0;
                        }
                    } else {
                        lastJ = n2[j];
                        j++;
                        count++;
                        if (count == mid) {
                            result = lastJ;
                        } else if (count - 1 == mid) {
                            return (result + lastJ) / 2.0;
                        }
                    }
                }
            }
        } else {
            // odd
            if (len1 == 0) return n2[len2 / 2];
            if (len2 == 0) return n1[len1 / 2];
            int chosen = Math.min(n1[0], n2[0]);
            while (i + j <= size / 2) {
                if (i >= len1) {
                    chosen = n2[j++];
                } else if (j >= len2) {
                    chosen = n1[i++];
                } else if (n1[i] < n2[j]) {
                    chosen = n1[i++];
                } else chosen = n2[j++];
            }
            result = chosen;
        }
        return result;
    }

    /*

    public double findMedianSortedArrays(int[] n1, int[] n2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : n1) pq.add(n);
        for (int n : n2) pq.add(n);
        int size = n1.length + n2.length;
        int mid = size / 2;
        if (size % 2 == 1) {
            for (int i = 0; i < mid; i++) pq.remove();
            return pq.remove() * 1.0;
        } else {
            for (int i = 0; i < mid - 1; i++) pq.remove();
            return (pq.remove() + pq.remove()) / 2.0;
        }
    }

     */

}
