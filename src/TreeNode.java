public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static String treeToString(TreeNode root)
    {
        String str = "";
        // bases case
        if (root == null)
            return str;

        // push the root data as character
        str += (char) (root.val + '0');

        // if leaf node, then return
        if (root.left == null && root.right == null)
            return str;

        // for left subtree
        str += ("->[");
        str += treeToString(root.left);
        str += (']');

        // only if right child is present to
        // avoid extra parenthesis
        if (root.right != null)
        {
            str += ("->[");
            str += treeToString(root.right);
            str += (']');
        }
        return str;
    }

}