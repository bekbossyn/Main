/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      22:16:09
*/


import java.util.ArrayList;
import java.util.List;

public class GetAllElements {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getLeaves(root1, list1);
        getLeaves(root2, list2);
        putLeaves(list1, list2, list);
        return list;
    }

    void getLeaves(TreeNode node, List<Integer> list) {
        if (node == null) return;
        getLeaves(node.left, list);
        list.add(node.val);
        getLeaves(node.right, list);
    }

    void putLeaves(List<Integer> l1, List<Integer> l2, List<Integer> res) {
        if (l1.size() == 0 && l2.size() == 0) return;
        if (l1.size() == 0) {
            int num = l2.get(l2.size() - 1);
            l2.remove(l2.size() - 1);
            putLeaves(l1, l2, res);
            res.add(num);
        } else if (l2.size() == 0) {
            int num = l1.get(l1.size() - 1);
            l1.remove(l1.size() - 1);
            putLeaves(l1, l2, res);
            res.add(num);
        } else {
            int ll1 = l1.get(l1.size() - 1);
            int ll2 = l2.get(l2.size() - 1);
            if (ll1 > ll2) {
                l1.remove(l1.size() - 1);
                putLeaves(l1, l2, res);
                res.add(ll1);
            } else {
                l2.remove(l2.size() - 1);
                putLeaves(l1, l2, res);
                res.add(ll2);
            }
        }
    }

}
