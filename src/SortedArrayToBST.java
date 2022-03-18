public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        for (int i = nums.length / 2 - 1; i >=0 ; i--) {
            TreeNode h = root;
            while (true) {
                if (nums[i] > h.val) {
                    if (h.right != null) {
                        h = h.right;
                    } else {
                        h.right = new TreeNode(nums[i]);
                        break;
                    }

                } else {
                    if (h.left != null) {

                        h = h.left;
                    }else {
                        h.left = new TreeNode(nums[i]);
                        break;
                    }
                }
            }
        }
        for (int i = nums.length / 2 + 1; i < nums.length; i++) {
            TreeNode h = root;
            while (true) {
                if (nums[i] > h.val) {
                    if (h.right != null) {
                        h = h.right;
                    } else {
                        h.right = new TreeNode(nums[i]);
                        break;
                    }

                } else {
                    if (h.left != null) {
                        h = h.left;
                    }else {
                        h.left = new TreeNode(nums[i]);
                        break;
                    }
                }
            }
        }
        return root;
    }
}
