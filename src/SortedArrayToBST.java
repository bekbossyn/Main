public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortBTS(nums, 0, nums.length-1);
    }
    public TreeNode sortBTS(int[] nums, int l, int r){
        if (l >r) return null;
        int m = (l + r +1)/ 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = sortBTS(nums, l, m-1);
        node.right = sortBTS(nums, m+1, r);
        return node;
    }
}
