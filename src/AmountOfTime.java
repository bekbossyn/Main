public class AmountOfTime {

    public int amountOfTime(TreeNode root, int start) {
        int d = depth(root);
        int dd = search(root, start);
        return d + dd;
    }

    public int depth(TreeNode h) {

        int l = 0;
        int r = 0;
        if (h.left != null) l = depth(h.left);
        if (h.right != null) r = depth(h.right);
        return Math.max(l, r) + 1;
    }

    public int search(TreeNode h, int s) {
        int l = 0;
        int r = 0;
        if (h.left != null) l = depth(h.left);
        if (h.right != null) r = depth(h.right);
        if (h.val == s)
            return Math.max(l, r) + 1;
        return 0;
    }

}
