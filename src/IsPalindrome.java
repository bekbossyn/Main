import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsPalindrome {

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

}
