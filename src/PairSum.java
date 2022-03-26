import java.util.Stack;

public class PairSum {

    public int pairSum(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        cnt /= 2;
        Stack<Integer> st = new Stack<>();
        head = h.next;
        while (cnt-- > 0) {
            st.add(head.val);
            head = head.next;
        }
        int maximus = 1;
        while (head != null) {
            maximus = Math.max(maximus, head.val + st.pop());
            head = head.next;
        }
        return maximus;
    }

}
