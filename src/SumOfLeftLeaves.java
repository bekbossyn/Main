public class SumOfLeftLeaves {

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, -1);
    }

    private int helper(TreeNode node, int i) {
        if (node == null) return 0;
        if (node.right == null && node.left == null && i == 0) return node.val;
        return helper(node.left, 0) + helper(node.right, -1);
    }


}
