public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        return helper(root, root, 0);
    }

    public boolean helper(TreeNode t1, TreeNode t2, int level) {

        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        // if (level % 2 == 0) {
        //     int temp = t1.left.val;
        //     t1.left.val = t2.right.val;
        //     t2.right.val = temp;
        // }

        return t1.val == t2.val && helper(t1.left, t2.right, level + 1) && helper(t1.right, t2.left, level + 1);

    }
    
}
