import java.util.ArrayList;
import java.util.List;

public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        int index = 0;
        while (head != null) {
            if (index % 2 == 0) {
                odd.add(head.val);
            } else {
                even.add(head.val);
            }
            head = head.next;
            index++;
        }
        ListNode dummy = new ListNode(0);
        head = dummy;
        for (Integer value : odd) {
            head.next = new ListNode(value);
            head = head.next;
        }
        for (Integer integer : even) {
            head.next = new ListNode(integer);
            head = head.next;
        }
        return dummy.next;
    }

}
