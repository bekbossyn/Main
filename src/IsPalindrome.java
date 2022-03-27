import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode slow = head, fast = head, rev = null;
        while (fast != null && fast.next != null) {
            ListNode t = rev;
            rev = slow;
            slow = slow.next;
            fast = fast.next.next;
            rev.next = t;
        }

        if (fast!= null) slow = slow.next;
        while (rev != null){
            if (rev.val != slow.val) return false;
            rev=rev.next;
            slow = slow.next;
        }
        return true;
    }

    /*
    public boolean isPalindrome(ListNode head) {
        Queue<Integer> qs = new LinkedList<>();
        int cnt = 0;
        while (head != null) {
            cnt++;
            qs.add(head.val);
            head = head.next;
        }
        int[] a = new int[cnt];
        cnt = 0;
        while (!qs.isEmpty()) a[cnt++] = qs.remove();
        for (int i = 0; i < (cnt + 1) / 2; i++)
            if (a[i] != a[cnt - i - 1]) return false;
        return true;
    }
     */

}
