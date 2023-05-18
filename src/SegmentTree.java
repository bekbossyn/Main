/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/18
[HH:MM:SS]      16:00:49
*/


public class SegmentTree {
    int[] st;

    SegmentTree(int[] arr) {
        int n = arr.length;
        int height = (int) Math.ceil(Math.log(n) / Math.log(2));
        int size = 2 * (int) Math.pow(2, height) - 1;
        st = new int[size];
        constructSTUtil(arr, 0, n - 1, 0);

    }

    private int getMid(int ss, int se) {
        return ss + (se - ss) / 2;
    }

    private int getSumUtil(int ss, int se, int qs, int qe, int si) {
        if (ss >= qs && se <= qe) return st[si];
        if (se < qs || ss > qe) return 0;
        int mid = getMid(ss, se);
        return getSumUtil(ss, mid, qs, qe, 2 * si + 1) + getSumUtil(mid + 1, se, qs, qe, 2 * si + 2);
    }

    private void updateValueUtil(int ss, int se, int position, int difference, int si) {
        if (position < ss || position > se) return;
        st[si] += difference;
        int mid = getMid(ss, se);
        if (ss != se) {
            updateValueUtil(ss, mid, position, difference, si * 2 + 1);
            updateValueUtil(mid + 1, se, position, difference, si * 2 + 2);
        }
    }

    int getSum(int n, int qs, int qe) {
        if (qs < 0 || qe > n - 1 || qs > qe) {
            System.out.println("Invalid Input");
            return -1;
        }
        return getSumUtil(0, n - 1, qs, qe, 0);
    }

    void updateValue(int[] arr, int position, int newValue) {
        int n = arr.length;
        if (position < 0 || position >= n) {
            System.out.println("Invalid Input");
            return;
        }
        int difference = newValue - arr[position];
        arr[position] = newValue;
        updateValueUtil(0, n - 1, position, difference, 0);
    }

    //  ss = segment tree start
    //  se = segment tree end
    //  si = segment tree initial position
    private int constructSTUtil(int[] arr, int ss, int se, int si) {
        if (ss == se) {
            st[si] = arr[ss];
            return arr[ss];
        }

        int mid = getMid(ss, se);
        st[si] = constructSTUtil(arr, ss, mid, si * 2 + 1) + constructSTUtil(arr, mid + 1, se, si * 2 + 2);
        return st[si];
    }

}
