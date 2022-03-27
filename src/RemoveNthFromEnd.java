import java.util.List;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode l = root, r = root;
        for (int i = 0; i <= n; i++)
            r = r.next;
        while (r != null) {
            l = l.next;
            r = r.next;
        }
        l.next = l.next.next;
        return root.next;
    }

}
