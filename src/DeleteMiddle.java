public class DeleteMiddle {

    public ListNode deleteMiddle(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        if (cnt == 1) return null;
        int middle = cnt / 2;
        int i = 0;
        head = h.next;
        while (true) {
            i++;
            if (middle == i) break;
            head = head.next;
        }
        head.next = head.next.next;
        return h.next;
    }

}
