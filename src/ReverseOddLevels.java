public class ReverseOddLevels {

    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root, root, 0);
        return root;
    }

    public void helper(TreeNode t1, TreeNode t2, int level) {

        if ((t1.left == null && t1.right == null) || (t2.left == null && t2.right == null)) return;

        if (level % 2 == 0) {
            int temp = t1.left.val;
            t1.left.val = t2.right.val;
            t2.right.val = temp;
        }

        helper(t1.left, t2.right, level + 1);
        helper(t1.right, t2.left, level + 1);

    }

}
