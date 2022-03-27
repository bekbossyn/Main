import java.util.List;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            return new ListNode(head.val);
        }
        ListNode l = reverseList(head.next);
        ListNode l1 = l;
        while (l1.next != null) l1 = l1.next;
        l1.next = new ListNode(head.val);
        return l;
    }

}
