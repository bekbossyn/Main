import javax.management.QueryEval;
import java.util.*;

public class SortList {

    public ListNode sortList(ListNode head) {
        ListNode n = head;

        // determine length of list
        //#TODO using queue get list then put to sorted array
        PriorityQueue<Integer> qs = new PriorityQueue<>();
        qs = convertToQueue(head);
        int cnt = qs.size();
//        if (head == null) System.out.println("null");

        // convert to array

        // sorting array
//        System.out.println(l);

        return toListNode(qs);
    }

    ListNode toListNode(PriorityQueue<Integer> qs) {
        if (qs.isEmpty()) return null;
        ListNode n = new ListNode(qs.remove());
//        n.val = l.indexOf(ind);
        n.next = toListNode(qs);
        return n;
    }

    PriorityQueue<Integer> convertToQueue(ListNode head) {
        PriorityQueue<Integer> qs = new PriorityQueue<>();
        while (head != null) {
            qs.add(head.val);
            head = head.next;
        }
        return qs;
    }

}
