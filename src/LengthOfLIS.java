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

    int n = 100001;
    int[] tree = new int[2 * n];

    public void update(int position, int value) {
        position += n;
        tree[position] = value;
        while (position > 1) {
            position /= 2;
            tree[position] = Math.max(tree[2 * position], tree[2 * position + 1]);
        }
    }

    public int max(int from, int to) {  //  [from, to)
        from += n;
        to += n;
        int max = 0;

        while (from < to) {
            if ((from & 1) == 1) {  //  if from is odd
                max = Math.max(max, tree[from]);
                from++;
            }
            if ((to & 1) == 1) { // if to is odd
                to--;   //  then it is the right child
                //  might as well use the parent
                max = Math.max(max, tree[to]);
            }
            from /= 2;  //  walk up to next level of the tree
            to /= 2;
        }
        return max;
    }

    public int lengthOfLIS(int[] ns, int k) {

        int result = 0;
        for (int to : ns) {
            int from = Math.max(0, to - k);
            int max = max(from, to) + 1;    //  best result for current element
            result = Math.max(result, max);
            update(to, max);             //  update max
        }
        return result;
    }
}
