public class LengthOfLIS {

    public int lengthOfLIS(int[] ns) {
        int len = ns.length;
        int[] b = new int[len];
        int max = 1;
        for (int i = 0; i < len; i++) {
            b[i] = 1;
            for (int to = i - 1; to >= 0; to--)
                if (ns[i] > ns[to] && (b[i] < b[to] + 1)) {
                    b[i] = b[to] + 1;
                    if (b[i] > max) {
                        max = Math.max(max, b[i]);
                        break;
                    }
                }
        }
        return max;
    }

    //  Segment tree with max query
    int[] sTree;
    int n;

    public class SegmentTree {

        SegmentTree(int n) {
            sTree = new int[2 * n];
        }

        void update(int position, int value) {
            position += n;
            sTree[position] = value;
            while (position > 1) {
                position /= 2;
                sTree[position] = Math.max(sTree[2 * position], sTree[2 * position + 1]);
            }
        }

        int max(int from, int to) {  //  [from, to)
            from += n;  //  original positions
            to += n;
            int max = 0;
            while (from < to) {
                if ((from & 1) == 1) {    //  odd
                    max = Math.max(max, sTree[from]);
                    from++;
                }
                if ((to & 1) == 1) {    //  odd
                    to--;
                    max = Math.max(max, sTree[to]);
                }
                from /= 2;
                to /= 2;
            }
            return max;
        }

    }


    public int lengthOfLIS(int[] ns, int k) {

        n = 100001;
        SegmentTree tree = new SegmentTree(n);
        int result = 0;
        for (int to : ns) {
            int from = Math.max(0, to - k);
            int max = tree.max(from, to) + 1;
            result = Math.max(result, max);
            tree.update(to, max);
        }
        return result;
    }

}
