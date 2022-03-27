public class SwapNodes {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode runLeft = start, runRight = start, pivot = start;
        for (int i = 1; i <= k; i++) {
            runLeft = runLeft.next;
            pivot = pivot.next;
        }
        while (pivot != null) {
            pivot = pivot.next;
            runRight = runRight.next;
        }
        int t = runLeft.val;
        runLeft.val = runRight.val;
        runRight.val = t;
        return start.next;
    }

}
