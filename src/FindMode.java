import java.util.*;

public class FindMode {
    HashMap<Integer, Integer> map;
    HashSet<Integer> set;
    int max, cnt;

    public int[] findMode(TreeNode root) {
        max = 0;
        cnt = 0;
        map = new HashMap<>();
        set = new HashSet<>();
        traverse(root);
        List<Integer> list = new ArrayList<>(set);
        int[] result = new int[cnt];
        cnt = 0;
        for (int cur : list) {
            if (map.get(cur) == max) {
                result[cnt++] = cur;
            }
        }
        return result;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        set.add(node.val);
        int temp = map.getOrDefault(node.val, 0) + 1;
        map.put(node.val, temp);
        if (max < temp) {
            cnt = 1;
            max = temp;
        } else if (max == temp)
            cnt++;
        traverse(node.left);
        traverse(node.right);
    }

}
