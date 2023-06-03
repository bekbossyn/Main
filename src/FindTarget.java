import java.util.HashMap;

public class FindTarget {

    public boolean findTarget(TreeNode root, int k) {
        return rec(root, k, new HashMap<>());
    }

    boolean rec(TreeNode node, int k, HashMap<Integer, Integer> hashMap) {
        if (node == null) return false;
        if (hashMap.containsKey(k - node.val)) {
            return true;
        } else {
            hashMap.put(node.val, 1);
            return rec(node.left, k, hashMap) || rec(node.right, k, hashMap);
        }
    }

}
