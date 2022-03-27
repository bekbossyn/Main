import java.util.List;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, cur = dummy.next;
        while (cur != null && cur.next != null) {
            prev.next = cur.next;
            cur.next = prev.next.next;
            prev.next.next = cur;
            prev = cur;
            cur = cur.next;
        }
        return dummy.next;
    }

}
