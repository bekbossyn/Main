import java.util.PriorityQueue;

public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> qs = new PriorityQueue<>();
        for (ListNode list: lists) {
            while (list!= null) {
                qs.add(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        if (qs.isEmpty()) return null;
        ListNode head = new ListNode(qs.remove());
        dummy.next = head;
        while (!qs.isEmpty()){
            head.next = new ListNode(qs.remove());
            head = head.next;
        }
        return dummy.next;
    }

}
