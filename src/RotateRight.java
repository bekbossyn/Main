/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      18:38:16
*/


import java.util.ArrayList;
import java.util.List;

public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        List<Integer> list = new ArrayList<>();
        ListNode nodeCopy = head;
        while (nodeCopy != null) {
            list.add(nodeCopy.val);
            nodeCopy = nodeCopy.next;
        }
        k = k % list.size();
        int posIndex = list.size() - k;
        if (posIndex == list.size()) return head;
        ListNode answer = new ListNode(list.get(posIndex));
        ListNode temp = answer;
        while (true) {
            posIndex++;
            if (posIndex == list.size()) break;
            temp.next = new ListNode(list.get(posIndex));
            temp = temp.next;
        }
        for (int i = 0; i < list.size() - k; i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return answer;
    }

}
