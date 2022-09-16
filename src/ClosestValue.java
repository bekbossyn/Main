public class ClosestValue {

    public int closestValue(TreeNode root, double target) {
        return helper(root, target);
    }

    int helper(TreeNode head, double target) {
        if (head != null) {
            double hVal = Math.abs(head.val - target);
            int ll = helper(head.left, target);
            double leftVal = Math.abs(ll - target);
            int rr = helper(head.right, target);
            double rightVal = Math.abs(rr - target);
            if (hVal <= leftVal && hVal <= rightVal)
                return head.val;
            if (leftVal <= hVal && leftVal <= rightVal)
                return ll;
            return rr;

        } else return 1000000001;
    }

}
