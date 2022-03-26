public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        cnt /= 2;
        head = h.next;
        while (cnt-- > 0) {
            head = head.next;
        }
        return head;
    }

}
